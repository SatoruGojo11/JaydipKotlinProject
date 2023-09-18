package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.jaydipkotlinproject.R

class Radio_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_prac)

        val gender_grp : RadioGroup = findViewById(R.id.gender_radiogrp)
        val submit_btn : Button = findViewById(R.id.submit_btn)
        val select_text : TextView = findViewById(R.id.select_text)


        gender_grp.setOnCheckedChangeListener { group, checkedId ->
            val gender : RadioButton = findViewById(checkedId)

            submit_btn.setOnClickListener {

                Toast.makeText(this, "${gender.text}", Toast.LENGTH_LONG).show()

                select_text.text = "You Choose ${gender.text}"
            }
        }


    }
}