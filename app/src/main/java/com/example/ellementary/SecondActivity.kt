package com.example.ellementary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (savedInstanceState ==null){
        val instance1 = intent.getSerializableExtra(TAG1) as? Student
        val instance2 = intent.getSerializableExtra(TAG2) as? Professor
        val instance3 = intent.getSerializableExtra(TAG3) as? Soldier
        val instance4 = intent.getSerializableExtra(TAG4) as? Gamer
        val instance5 = intent.getSerializableExtra(TAG5) as? Sportsman

        val fragment = FirstFragment.newInstance(instance1, instance2, instance3, instance4, instance5)

            supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()

        }
    }

    companion object{
        const val TAG1 = "student"
        const val TAG2 = "professor"
        const val TAG3 = "soldier"
        const val TAG4 = "gamer"
        const val TAG5 = "sportsman"

        fun getInent( context : Context,  student : Student? = null, professor : Professor? = null,
                      soldier : Soldier? = null, gamer : Gamer? = null, sportsman : Sportsman? = null ) : Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(TAG1, student)
            intent.putExtra(TAG2, professor)
            intent.putExtra(TAG3, soldier)
            intent.putExtra(TAG4, gamer)
            intent.putExtra(TAG5, sportsman)
            return intent
        }
    }
}