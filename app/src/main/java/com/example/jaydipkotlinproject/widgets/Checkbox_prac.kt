package com.example.firstkotlinproject.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.jaydipkotlinproject.R
import com.squareup.picasso.Picasso

class Checkbox_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_prac)

        val sandwichprice : CheckBox = findViewById(R.id.sandwich_dtl)
        val pizzaprice : CheckBox = findViewById(R.id.pizza_dtl)
        val burgerprice : CheckBox = findViewById(R.id.burger_dtl)
        val dabeliprice : CheckBox = findViewById(R.id.dabeli_dtl)
        val billbtn : Button = findViewById(R.id.bill_btn)
        val sandwichimg : ImageView = findViewById(R.id.sandwich_img)
        val pizzaimg : ImageView = findViewById(R.id.pizza_img)
        val burgerimg : ImageView = findViewById(R.id.burger_img)
        val dabeliimg : ImageView = findViewById(R.id.dabeli_img)
        val billdtl : TextView = findViewById(R.id.bill_details)

        Picasso.get().load("https://janviparmar75.files.wordpress.com/2015/04/turkey_bacon_avocado.png").into(sandwichimg);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr_FhSQqyiIW_4TeILNCDGHkgT2XmY93OBIg&usqp=CAU").into(pizzaimg);
        Picasso.get().load("https://png.pngtree.com/png-clipart/20230216/ourmid/pngtree-juicy-burgers-with-a-transparent-background-png-image_6603069.png").into(burgerimg);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-5LvA3JiEQ4Pwe75gIRiXI_naUF0bCRQaVNAp0TEo1q7pCkan-POHM_Sj77lZWXzkbuE&usqp=CAU").into(dabeliimg);
        billbtn.setOnClickListener {
            var temp = 0

            if(sandwichprice.isChecked){
                temp += 200
            }
            if(pizzaprice.isChecked){
                temp += 280
            }
            if(burgerprice.isChecked){
                temp += 60
            }
            if(dabeliprice.isChecked){
                temp += 25
            }

            val billdetail = "Your Total Bill Amount is :- $temp"
            billdtl.text = billdetail

            Toast.makeText(this,"Your bill is :- $temp",Toast.LENGTH_LONG).show()

        }
    }
}