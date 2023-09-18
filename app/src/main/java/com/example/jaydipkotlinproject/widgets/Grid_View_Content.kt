package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.jaydipkotlinproject.R
import com.squareup.picasso.Picasso

class Grid_View_Content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view_content)

        val image : ImageView = findViewById(R.id.item_img)
        val imageurl : TextView = findViewById(R.id.item_name)

        val imagelink : String? = intent.getStringExtra("Imagelink")

        Picasso.get().load(imagelink).into(image)
        imageurl.text = "Image Link :- ${imagelink.toString()}"
    }
}