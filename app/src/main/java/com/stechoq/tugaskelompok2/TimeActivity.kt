package com.stechoq.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.stechoq.tugaskelompok2.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            view
            view2
            view3
            view4
            view5
        }

        binding.backtime.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}