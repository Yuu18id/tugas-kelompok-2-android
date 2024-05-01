package com.stechoq.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Workout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_workout)

        val backButton = findViewById<ImageButton>(R.id.backwork)
        backButton.setOnClickListener {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}