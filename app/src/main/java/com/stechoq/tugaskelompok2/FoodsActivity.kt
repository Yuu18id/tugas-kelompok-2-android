package com.stechoq.tugaskelompok2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.stechoq.tugaskelompok2.data.FoodsData
import com.stechoq.tugaskelompok2.databinding.ActivityFoodsBinding

class FoodsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFoodsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_foods)

        val food: FoodsData =
            FoodsData(
                "Carbo: Carbohydrates are the primary source of energy for the human body. Products made from these grains, such as bread, pasta, and cereals, also provide carbohydrates.",
                "Protein: An important source of animal protein for the growth and maintenance of the body. If someone is vegetarian, it can be replaced with tempeh, tofu, or other vegetable protein sources.",
                "Vegetables: It provides fiber, vitamins, and minerals necessary for a healthy body. It is recommended to include various types of colorful vegetables in the diet",
                "Fruits: Fruits are a great source of vitamins, minerals, and fiber that are essential for health. It is recommended to consume various types of fresh fruits.\""

            )
        binding.foods = food

        binding.backfood.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}