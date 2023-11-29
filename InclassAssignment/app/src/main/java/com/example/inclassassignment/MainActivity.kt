package com.example.inclassassignment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.core.graphics.toColor
import com.example.inclassassignment.databinding.ActivityMainBinding

//버튼을 클릭할 때마다 3개 속성이 바뀜.
//초기 글자 위치는 TOP.
//버튼을 클릭 할 때마다 TOPENDBOTTOMCENTERTOP...로바뀜 초기 글자 크기는 10f.버튼을 클릭 할 때마다 10f18f26f34f10f18f...로바뀜
//초기 TextView 배경색은 LTGRAY. 버튼을 클릭할 때마다 LTGREY  MAGENTA  GREEN  YELLOW
// LTGREY...로바뀜

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var backColor = arrayOf<Int>(Color.LTGRAY, Color.MAGENTA, Color.GREEN, Color.YELLOW)
        var textAlign = arrayOf(Gravity.TOP, Gravity.END, Gravity.BOTTOM, Gravity.CENTER)
        var textSize = arrayOf(10f, 18f, 26f, 34f)
        var i = 0
        binding.button.setOnClickListener {
            binding.textView.apply {
                setTextSize(textSize[i])
                setBackgroundColor(backColor[i])
                gravity = textAlign[i]
            }
            if (i == 3) { i = -1 }
            i++
        }
    }
}