package ba.mop.android.mapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.info_button).setOnClickListener {
            showAppInfo()
            greet()
        }
    }

    // sample comment

    @SuppressLint("SetTextI18n")
    private fun showAppInfo() {
        findViewById<TextView>(R.id.info_text)
            .text = """
                    Version name: ${BuildConfig.VERSION_NAME}
                    Version code: ${BuildConfig.VERSION_CODE}
                    Branch: ${BuildConfig.BRANCH}
                    Ci/Cd-built: ${BuildConfig.IS_CICD}
                    """.trimIndent()
    }

    fun greet() {
        Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show()
    }
}