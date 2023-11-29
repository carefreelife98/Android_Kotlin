package com.example.intentexample

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.example.intentexample.databinding.ActivityMainBinding

const val MY_STRING = "my_string"
const val MY_INT = "my_int"
const val RETURN_STRING = "com.example.intentexample.RETURN_STRING"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val startForResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            result.data?.let {
                // result.data 는 절대 null 값이 아님을 Guarantee.
                val extras: Bundle? = result.data!!.extras
                val qString = extras?.getString(RETURN_STRING)
                val qInt = extras?.getInt(MY_INT)
                binding.editText.setText("$qString-$qInt")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println(intent)
        binding.button.setOnClickListener {
            val str = binding.editText.text.trim().toString()
            Intent(this@MainActivity, SubActivity::class.java)
                .apply {
                    this.putExtra(MY_STRING, str)
                    // this 생략 가능
                    putExtra(MY_INT, 13)
                    startForResult.launch(this)
//                    startActivity(this)
                }
        }

    }
}