package com.example.mynewapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // property of class. 접근 제어자 사용 가능.
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClicked(view: View) {
        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)

        // 모든 view 초기화 - INVISIBLE
        imageView.visibility = View.INVISIBLE
        imageView2.visibility = View.INVISIBLE
        imageView3.visibility = View.INVISIBLE

        count += 1
        when (count % 3) {
            0 -> imageView.visibility = View.VISIBLE
            1 -> imageView.visibility = View.VISIBLE
            2 -> imageView.visibility = View.VISIBLE
        }
    }
}