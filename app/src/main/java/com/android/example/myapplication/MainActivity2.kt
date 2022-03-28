package com.android.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myButton = findViewById<Button>(R.id.button3)

        myButton.setOnClickListener {
            val text1 = resources.getString(R.string.toast3)
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(applicationContext, text1, duration);toast.show()
        }
    }
}