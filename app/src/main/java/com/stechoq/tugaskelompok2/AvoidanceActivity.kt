package com.stechoq.tugaskelompok2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.databinding.DataBindingUtil
import com.stechoq.tugaskelompok2.data.AvoidanceData
import com.stechoq.tugaskelompok2.databinding.ActivityAvoidanceBinding

class AvoidanceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAvoidanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_avoidance)

        val avoidanceData = AvoidanceData(
            "Cover your mouth and nose with a tissue when coughing or sneezing, or use the inside of your elbow to cover your mouth and nose."
        )

        binding.avoidance = avoidanceData

        val backButton = findViewById<ImageButton>(R.id.backav)
        backButton.setOnClickListener {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        binding.apply {
            sncdav
            thrdav
            frthav
        }
    }
}