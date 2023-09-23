package com.example.jaydipkotlinproject.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat.Action
import com.example.jaydipkotlinproject.R

class Share_Text_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_text_prac)

        val sharetext : EditText = findViewById(R.id.sharetextfield)
        val sharebtn : Button = findViewById(R.id.sharebtn)

        sharebtn.setOnClickListener {

            val text = sharetext.text.toString()

            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,text)
                type = "text/plain"
            }

            startActivity(Intent.createChooser(intent,null))
        }
    }
}