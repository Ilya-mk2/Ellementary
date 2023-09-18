package com.example.ellementary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : Button = findViewById(R.id.student_button)
        val button2 : Button = findViewById(R.id.professor_button)
        val button3 : Button = findViewById(R.id.soldier_button)
        val button4 : Button = findViewById(R.id.gamer_button)
        val button5 : Button = findViewById(R.id.sportsman_button)


        button1.setOnClickListener{
            val intent = SecondActivity.getInent(this, Student())
            startActivity(intent)

        }
        button2.setOnClickListener{
            val intent = SecondActivity.getInent(this, Student(), Professor())
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = SecondActivity.getInent(this, Student(), Professor(), Soldier())
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = SecondActivity.getInent(this, Student(), Professor(), Soldier(), Gamer())
            startActivity(intent)
        }
        button5.setOnClickListener{
            val intent = SecondActivity.getInent(this, Student(), Professor(), Soldier(), Gamer(),Sportsman())
            startActivity(intent)
        }
    }

}