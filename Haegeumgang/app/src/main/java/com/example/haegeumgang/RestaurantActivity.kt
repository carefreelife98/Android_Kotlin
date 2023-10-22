package com.example.haegeumgang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.haegeumgang.databinding.ActivityRestaurantBinding

class RestaurantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RestaurantExitBtn.setOnClickListener { finish() }
    }
}