package com.example.intentexample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if(intent == null || intent.extras == null) return

        // elvis 연산자 사용
        // intent == 현재 Activity 를 생성한 Intent 를 참조 (변수 아님)
        val extras: Bundle = intent.extras ?: return
        // let : null 이 아닌 경우에만 Scope Function 실행
        extras.let {
            val qString = it.getString(MY_STRING)
            val qInt = it.getInt(MY_INT)
            binding.editText.setText("$qString - $qInt")
        }

        binding.button.setOnClickListener {
            val str = binding.editText.text.toString()
            val data = Intent().apply {
                putExtra(RETURN_STRING, str)
                putExtra(MY_INT, 14)
            }
            setResult(Activity.RESULT_OK, data)
            finish()
        }
    }
}