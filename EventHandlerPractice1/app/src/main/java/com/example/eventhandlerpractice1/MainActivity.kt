package com.example.eventhandlerpractice1

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.FrameLayout
import android.widget.Toast
import com.example.eventhandlerpractice1.databinding.ActivityMainBinding
import java.lang.StringBuilder
import kotlin.math.roundToInt

//const val TAG = ">>Unit Conversion"

class MainActivity : AppCompatActivity() {
    var sb = StringBuilder() // 문자열 축적

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.touchView.setOnTouchListener { _, event ->
            handleTouch(event)
            true
        }
    }

    private fun handleTouch(m: MotionEvent? ) {
        if (m == null) return

        var x: Float = m.x
        var y: Float = m.y

        when (m.action) {
            MotionEvent.ACTION_DOWN -> sb.append("손가락 터치: $x $y \n")
            MotionEvent.ACTION_UP -> sb.append("손가락 땜: $x $y \n")
            MotionEvent.ACTION_MOVE -> sb.append("손가락 이동: $x $y \n")
            else -> sb.append(" \n")
        }

        binding.textView.text = sb.toString()
    }
}