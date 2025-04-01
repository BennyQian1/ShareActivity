package edu.temple.funwithintents

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This view contains the text to share
        val editText = findViewById<EditText>(R.id.editTextText)

        // When the user clicks this button, share the text if not empty
        findViewById<ImageButton>(R.id.shareImageButton).setOnClickListener {

            val sendIntent = Intent(Intent.ACTION_SEND)
            //or you can add "sendIntent.action = Intent.ACTION_SEND" instead of "(Intent.ACTION_SEND)"
            sendIntent.putExtra(Intent.EXTRA_TEXT,editText.toString())
            sendIntent.type = "text/plain"
            startActivity(sendIntent)

        }
    }
}