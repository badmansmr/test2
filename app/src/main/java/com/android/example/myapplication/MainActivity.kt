package com.android.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
            val text1 = resources.getString(R.string.toast2)
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, text1, duration); toast.show()
            startActivity(Intent(this, MainActivity2::class.java))
        }

        val myButton2 = findViewById<Button>(R.id.button2)
        myButton2.setOnClickListener {
            val text = resources.getString(R.string.toast1)
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, text, duration);toast.show()
        }
    }
}