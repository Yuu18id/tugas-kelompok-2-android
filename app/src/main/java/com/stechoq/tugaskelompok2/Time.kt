package com.stechoq.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Time : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_time)

        val backButton = findViewById<ImageButton>(R.id.backtime)
        backButton.setOnClickListener {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}