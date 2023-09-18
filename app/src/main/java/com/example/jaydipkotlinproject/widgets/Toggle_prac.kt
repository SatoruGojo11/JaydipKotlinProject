package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat
import com.example.jaydipkotlinproject.R

class Toggle_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_prac)

        var wificlick = 0
        var blthclick = 0
        val wifi : ToggleButton = findViewById(R.id.wifi_tgl)
        val bluetooth : ToggleButton = findViewById(R.id.bluetooth_tgl)

        wifi.setOnClickListener {

            if (wificlick == 1) {
                Toast.makeText(this, "Wifi OFF", Toast.LENGTH_SHORT).show()
                wificlick = 0
            }
            else{
                Toast.makeText(this, "Wifi ON", Toast.LENGTH_SHORT).show()
                wificlick = 1
            }
        }

        bluetooth.setOnClickListener {
            if (blthclick == 1) {
                Toast.makeText(this, "Bluetooth OFF", Toast.LENGTH_SHORT).show()
                blthclick = 0
            }
            else{
                Toast.makeText(this, "Bluetooth ON", Toast.LENGTH_SHORT).show()
                blthclick = 1
            }
        }
    }
}