package com.stechoq.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {

    private lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        img = findViewById(R.id.img_food)
        img.setOnClickListener {
            startActivity(Intent(this, FoodsActivity::class.java))
        }
        img = findViewById(R.id.img_workout)
        img.setOnClickListener {
            startActivity(Intent(this, Workout::class.java))
        }
        img = findViewById(R.id.img_clock)
        img.setOnClickListener {
            startActivity(Intent(this, TimeActivity::class.java))
        }
    }
}