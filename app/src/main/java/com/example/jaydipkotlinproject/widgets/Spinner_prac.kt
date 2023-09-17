package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TabStopSpan
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.firstkotlinproject.R

class Spinner_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_prac)

        val myspinner: Spinner = findViewById(R.id.my_spinner)

        val data = arrayOf(
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5",
            "Item 6",
            "Item 7",
        )

        myspinner.adapter = ArrayAdapter(
            this,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
            data
        )

        myspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Spinner_prac, "${data[position]} Selected", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

                Toast.makeText(this@Spinner_prac, "No item Selected", Toast.LENGTH_SHORT)
                    .show()

            }

        }
    }
}