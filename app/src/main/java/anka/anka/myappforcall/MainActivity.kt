package anka.anka.myappforcall

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val TEXT = "PARAM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<EditText>(R.id.nameEditText)
        val runEcho: Button = findViewById(R.id.runEchoButton)

        runEcho.setOnClickListener { View.OnClickListener {
            fun onClick(v: View?) {
            val uri: Uri = Uri.parse("example://intent")
            val runEchoIntent = Intent(Intent.ACTION_VIEW, uri)
            runEchoIntent.putExtra(TEXT, text.text.toString())
                val activityInfo = runEchoIntent.resolveActivityInfo(
                    packageManager,
                    runEchoIntent.flags
                )
                if (activityInfo != null) {
                    startActivity(runEchoIntent)
                }
        } } }
        val dd = runEcho.callOnClick()

    }
}