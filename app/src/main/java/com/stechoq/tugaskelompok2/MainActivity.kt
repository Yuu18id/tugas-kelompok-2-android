package com.stechoq.tugaskelompok2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.stechoq.tugaskelompok2.databinding.ActivityMainBinding
import com.stechoq.tugaskelompok2.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewModel: MainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.titleTextView.text = viewModel.title
        binding.DescTextView.text = viewModel.desc

        val btnStart = findViewById<Button>(R.id.btnstart)
        btnStart.setOnClickListener {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}