package com.example.inclassapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.inclassapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var myTextView: TextView
//    private val binding: ActivityMainBinding by lazy {
//        ActivityMainBinding.inflate(layoutInflater)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener( this )
//        myTextView = findViewById(R.id.myTextView)
//        val myButton = findViewById<Button>(R.id.myButton)



//        myButton.setOnClickListener( object : View.OnClickListener {
//            override fun onClick(v: View?) {
//
//            }
//        })
//        myButton.setOnLongClickListener( object : View.OnLongClickListener {
//            override fun onLongClick(v: View?): Boolean {
//                return true
//            }
//
//        })

        // myButton.setOnClickListener()에 넘겨질 리스너 객체를 위한 클래스 생성
//        class MyListener : View.OnClickListener { // nested Class : 클래스 바깥을 절대 참조하지 않는다.
//            override fun onClick(v: View?) { // callback Method
//                myTextView.text = "Hi, Android 13!"
//            }
//        }

//        val ls = MyListener()
//        myButton.setOnClickListener(ls)
//        // Lambda 식으로 변환.
//        myButton.setOnClickListener(ls)
    }

    override fun onClick(v: View?) {
        val s = getString(R.string.outStr)
        binding.myTextView.text = String.format(s, 14)
//        binding.myTextView.text = getString(R.string.outStr)
    }
}