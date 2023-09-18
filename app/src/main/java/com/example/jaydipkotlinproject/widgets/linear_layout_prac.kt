package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.jaydipkotlinproject.R
import kotlin.random.Random

class linear_layout_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout_prac)

            val rannumber : TextView = findViewById(R.id.random_num)
            val ranclickbutton : Button = findViewById(R.id.random_btn)

            ranclickbutton.setOnClickListener {

                val num = Random.nextInt(20)
                rannumber.text = "Your number is :- ${num.toString()}"

                val t1 = Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG);
                t1.show();

            }
        }
}