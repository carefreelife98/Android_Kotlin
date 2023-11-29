package com.example.myarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioButton
import android.widget.RadioGroup.OnCheckedChangeListener
import android.widget.Toast
import com.example.myarray.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val colorArr: Array<String> = resources.getStringArray(R.array.colors)
        binding.radioRed.text = colorArr[0]
        binding.radioGreen.text = colorArr[1]
        binding.radioBlue.text = colorArr[2]

//        when {
//            binding.radioRed.isChecked -> showToast(colorArr[0])
//            binding.radioGreen.isChecked -> showToast(colorArr[1])
//            binding.radioBlue.isChecked -> showToast(colorArr[2])
//            else -> showToast("")
//        }

        val lis = RadioListener()
        binding.radioRed.setOnCheckedChangeListener(lis)
        binding.radioGreen.setOnCheckedChangeListener(lis)
        binding.radioBlue.setOnCheckedChangeListener(lis)

        val radioArray:Array<RadioButton> = arrayOf<RadioButton>(
            binding.radioRed,
            binding.radioGreen,
            binding.radioBlue
        )
        if (radioArray.none { it.isChecked }) {
            showToast("")
        } else {
            radioArray.forEach {
                if(it.isChecked) showToast(it.text.toString())
            }
        }

//        radioArray.forEachIndexed { i, rb ->
//            rb.text = colorArr[i]
//        }

    }

    inner class RadioListener : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(cb: CompoundButton?, checked: Boolean) {
            if (cb == null) return
            if (checked) {
                val msg = "${cb.text} 를 선택했군요"
                Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showToast(str: String) {
        var msg = if (str.isNotEmpty()) {
            "$str 이 기본 선택되어 있습니다."
        } else {
            "아무 것도 선택되어 있지 않습니다."
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}