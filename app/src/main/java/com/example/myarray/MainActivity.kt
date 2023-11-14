package com.example.myarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geojae_river.R
import com.example.geojae_river.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}