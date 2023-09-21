package com.example.firstkotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstkotlinproject.widgets.Card_View_prac
import com.example.firstkotlinproject.widgets.Checkbox_prac
import com.example.firstkotlinproject.widgets.Constraint_layout_prac
import com.example.firstkotlinproject.widgets.Date_Time_Picker_prac
import com.example.jaydipkotlinproject.MyGridView.Grid_View_prac
import com.example.firstkotlinproject.widgets.Image_View_prac
import com.example.firstkotlinproject.widgets.Radio_prac
import com.example.firstkotlinproject.widgets.Relative_layout_prac
import com.example.firstkotlinproject.widgets.Spinner_prac
import com.example.firstkotlinproject.widgets.Switch_Compat_prac
import com.example.firstkotlinproject.widgets.Toggle_prac
import com.example.firstkotlinproject.widgets.linear_layout_prac
import com.example.jaydipkotlinproject.R

class Home_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val constraint_layout: Button = findViewById(R.id.constraint_layout)
        val relative_layout: Button = findViewById(R.id.relative_layout)
        val linear_layout: Button = findViewById(R.id.linear_layout)
        val date_time_picker: Button = findViewById(R.id.date_time_picker)
        val checkbbox: Button = findViewById(R.id.check_box)
        val radio: Button = findViewById(R.id.radio)
        val cardView: Button = findViewById(R.id.card_view)
        val spinner: Button = findViewById(R.id.spinner)
        val imageView: Button = findViewById(R.id.image_view)
        val toggle: Button = findViewById(R.id.toggle)
        val switchcompat: Button = findViewById(R.id.switchcompat)
        val gridview: Button = findViewById(R.id.gridview)

        constraint_layout.setOnClickListener {
            intent = Intent(this, Constraint_layout_prac::class.java)
            startActivity(intent)
        }

        relative_layout.setOnClickListener {
            intent = Intent(this, Relative_layout_prac::class.java)
            startActivity(intent)
        }

        linear_layout.setOnClickListener {
            intent = Intent(this, linear_layout_prac::class.java)
            startActivity(intent)
        }

        date_time_picker.setOnClickListener {
            intent = Intent(this, Date_Time_Picker_prac::class.java)
            startActivity(intent)
        }

        checkbbox.setOnClickListener {
            intent = Intent(this, Checkbox_prac::class.java)
            startActivity(intent)
        }

        radio.setOnClickListener {
            intent = Intent(this, Radio_prac::class.java)
            startActivity(intent)
        }

        cardView.setOnClickListener {
            intent = Intent(this, Card_View_prac::class.java)
            startActivity(intent)
        }

        spinner.setOnClickListener {
            intent = Intent(this, Spinner_prac::class.java)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent = Intent(this, Image_View_prac::class.java)
            startActivity(intent)
        }

        toggle.setOnClickListener {
            intent = Intent(this, Toggle_prac::class.java)
            startActivity(intent)
        }

        switchcompat.setOnClickListener {
            intent = Intent(this, Switch_Compat_prac::class.java)
            startActivity(intent)
        }

//        gridview.setOnClickListener {
//            intent = Intent(this, Grid_View_prac::class.java)
//            startActivity(intent)
//        }
    }
}