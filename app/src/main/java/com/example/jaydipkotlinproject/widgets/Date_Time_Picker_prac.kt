package com.example.firstkotlinproject.widgets

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import com.example.jaydipkotlinproject.R
import java.util.Calendar

class Date_Time_Picker_prac : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {

    lateinit var btnTime: Button
    lateinit var btnDate: Button
    lateinit var Showdate: TextView
    lateinit var Showtime: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time_picker_prac)

        btnDate = findViewById(R.id.date_btn)
        btnTime = findViewById(R.id.time_btn)
        Showdate = findViewById(R.id.date_txt)
        Showtime = findViewById(R.id.time_txt)

        val Currentdatetime = Calendar.getInstance()

        btnDate.setOnClickListener {
            DatePickerDialog(
                this,
                this,
                Currentdatetime.get(Calendar.YEAR),
                Currentdatetime.get(Calendar.MONTH),
                Currentdatetime.get(Calendar.DAY_OF_MONTH),
            ).show()
        }

        btnTime.setOnClickListener {
            TimePickerDialog(
                this,
                this,
                Currentdatetime.get(Calendar.HOUR_OF_DAY),
                Currentdatetime.get(Calendar.MINUTE),
                true,
            ).show()
        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

        Showdate.text = "Date :- $dayOfMonth / ${month+1} / $year"
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {

        var hour = hourOfDay
        var timeset = ""

        if(hour == 12){
            timeset = "PM"
        }
        else if(hour == 0){
            timeset = "AM"
        }
        else if(hour > 12){
            hour -= 12
            timeset = "PM"
        }
        else {
            timeset = "AM"
        }

        val mnt = if(minute < 10) "0$minute" else "$minute"

        Showtime.text = "Time :- $hour : $mnt $timeset"
    }
}