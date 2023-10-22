package com.example.haegeumgang

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.haegeumgang.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentOfInfo = Intent(this, InfoActivity::class.java)
        binding.info.setOnClickListener { startActivity(intentOfInfo) }

        val intentOfMap = Intent(this, MapsActivity::class.java)
        binding.wayToVisit.setOnClickListener { startActivity(intentOfMap) }

        val intentOfRestaurant = Intent(this, RestaurantActivity::class.java)
        binding.restaurant.setOnClickListener { startActivity(intentOfRestaurant) }
    }
}