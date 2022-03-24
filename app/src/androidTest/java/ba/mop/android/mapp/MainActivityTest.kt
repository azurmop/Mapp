package ba.mop.android.mapp

import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.kaspersky.kaspresso.screens.KScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class MainActivityTest : TestCase() {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun myTest() {
        before {
            activityTestRule.launchActivity(null)
        }.after {
        }.run {
            Screen {
                infoButton.click()
                infoText.hasAnyText()
            }
        }
    }
}

object Screen : KScreen<Screen>() {
    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val infoButton = KButton { withId(R.id.info_button) }
    val infoText = KTextView { withId(R.id.info_text) }
}