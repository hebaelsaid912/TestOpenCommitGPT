package com.example.testopencommitgpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMeBtn = findViewById<Button>(R.id.clickme)
        val text = findViewById<TextView>(R.id.textView)
        var count:Int = 0
        clickMeBtn.setOnClickListener{
            count++
            text.text = count.toString()
        }
    }
}