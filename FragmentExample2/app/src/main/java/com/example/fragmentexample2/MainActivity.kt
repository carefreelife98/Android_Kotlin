package com.example.fragmentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import com.example.fragmentexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

//    override fun sendWord(word: String) {
////        val fragB: FragmentB = supportFragmentManager.findFragmentById(R.id.fragment_b) as FragmentB
////        fragB.showWord(word)
//        val fragB = FragmentB.newInstance(word)
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fragment_b, fragB)
//        }
//    }
