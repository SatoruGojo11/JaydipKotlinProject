package com.example.jaydipkotlinproject.widgets

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import com.example.jaydipkotlinproject.R

class Share_Image_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_image_prac)

        val shareImage : ImageView = findViewById(R.id.shareImage)
        val imgsharebtn : Button = findViewById(R.id.imgsharebtn)

        imgsharebtn.setOnClickListener {

            val img = BitmapFactory.decodeResource(resources,R.drawable.instagram)

            val path = MediaStore.Images.Media.insertImage(contentResolver,img,"Title",null)

            val uri = Uri.parse(path)

            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_STREAM,uri)
                type = "image/png"
            }

            startActivity(Intent.createChooser(intent,"Share to :- "))
        }
    }
}