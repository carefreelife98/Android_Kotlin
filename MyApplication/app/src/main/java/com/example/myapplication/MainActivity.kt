package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

const val VERSION = "13"

class MainActivity : AppCompatActivity() {
    // Class 의 속성.
    // main file 이름이 activity_main.xml 이므로
    // ActivityMainBinding 이라는 이름을 사용
    private lateinit var binding:ActivityMainBinding

    // var type 은 lateinit 사용하여 지연 초기화.
//    // val type 은 by lazy {} 사용하여 지연 초기화.
//    private val binding: ActivityMainBinding by lazy {
//        ActivityMainBinding.inflate(layoutInflater)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.myButton.setOnClickListener{
            binding.textView.text = "안녕, 안드로이드 $VERSION"
        }
    }

    fun onButtonClicked(view: View) {
//        val textView = findViewById<TextView>(R.id.textView) // R = Resource File
        binding.textView.text = "안녕, 안드로이드 $VERSION !"
    }

}