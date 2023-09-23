package com.example.jaydipkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import com.example.jaydipkotlinproject.R

class Seek_Bar_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar_prac)

        val seekbartext: TextView = findViewById(R.id.seekbartext)
        val seekbar: SeekBar = findViewById(R.id.seek_bar)

        seekbar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                    seekbartext.text = "$progress"
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {
                    Toast.makeText(this@Seek_Bar_prac, "Start Progress", Toast.LENGTH_SHORT).show()
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                    Toast.makeText(this@Seek_Bar_prac, "End Progress", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }
}