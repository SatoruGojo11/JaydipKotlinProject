package com.example.firstkotlinproject.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.firstkotlinproject.R

class Constraint_layout_prac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout_prac)

        var amt = 5
        var temp = 0
        val attmpt: TextView = findViewById(R.id.attmpt)
        val username: EditText = findViewById(R.id.user_name_login)
        val useremail: EditText = findViewById(R.id.user_email_login)
        val userpwd: EditText = findViewById(R.id.user_pwd_login)
        val signinbtn: Button = findViewById(R.id.sign_in_btn)
        val signupbtn: Button = findViewById(R.id.sign_up_btn)
        val image: ImageView = findViewById(R.id.profile_img)

        signinbtn.setOnClickListener {


            if (username.text.isEmpty() || useremail.text.isEmpty() || userpwd.text.isEmpty()) {


                if (amt > 0) {
                    amt = amt - 1;
                    attmpt.text = "Attempt Left :- $amt"
                    intent = Intent(this, Constraint_layout_prac::class.java)
                    startActivity(intent)

                } else if (amt == 0) {
                    attmpt.text = "Sorry, Try Again Later..."
                } else {
                    attmpt.text = "Attempt Left :- $amt"
                    intent = Intent(this, Constraint_layout_prac::class.java)
                    startActivity(intent)
                }
            }
        }

        signupbtn.setOnClickListener {
            if (username.text.isEmpty() || useremail.text.isEmpty() || userpwd.text.isEmpty()) {
                if (amt > 0) {
                    amt = amt - 1;
                    attmpt.text = "Attempt Left :- $amt"
                } else if (amt == 0) {
                    attmpt.text = "Sorry, Try Again Later..."
                }
            } else {
                attmpt.text = "Attempt Left :- $amt"
                intent = Intent(this, Constraint_layout_prac::class.java)
                startActivity(intent)
            }
        }

        image.setOnClickListener {

            if (temp == 1) {
                image.setImageResource(R.drawable.closed_eye)
                temp = 0
            } else if (temp == 0) {
                image.setImageResource(R.drawable.open_eye)
                temp = 1

            }
            Toast.makeText(this, "Image Changed", Toast.LENGTH_LONG).show()
        }
    }
}