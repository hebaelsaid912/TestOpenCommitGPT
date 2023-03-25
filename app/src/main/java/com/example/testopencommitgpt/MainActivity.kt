package com.example.testopencommitgpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMeBtn = findViewById<Button>(R.id.clickme)
        val imageView = findViewById<ImageView>(R.id.testImg)
        clickMeBtn.setOnClickListener{
           if (imageView.visibility == View.VISIBLE)
               imageView.visibility = View.INVISIBLE
            else
                imageView.visibility = View.VISIBLE
        }
    }
}