package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.jaydipkotlinproject.R

class Image_View_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view_prac)

        var temp = 0
        val image : ImageView = findViewById(R.id.image_prac)

        image.setOnClickListener {

            if (temp == 1) {
                image.setImageResource(R.drawable.closed_eye)
                temp = 0
            } else if (temp == 0) {
                image.setImageResource(R.drawable.open_eye)
                temp = 1

            }


            Toast.makeText(this, "Image Changed", Toast.LENGTH_LONG).show()

        }

    }
}