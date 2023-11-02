package com.example.exchangerate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.exchangerate.databinding.ActivityMainBinding
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // lateinit 은 기본 타입(String, Int, Double...) 등이 아니어야 가능함.
    // 따라서 직접 생성시에 초기화.
    private var rate: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        rate = R.string.exchange_rate.toString()
        binding.currentRateTextView.text = rate

        binding.wonEditText.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
//                doChangeCurrency(s?.toString())
            }
        })

        binding.convertButton.setOnClickListener {
            val wonValueStr: String = binding.wonEditText.text.trim().toString()
            doChangeCurrency(wonValueStr)
        }
    }

    private fun doChangeCurrency(valStr: String) {
        if (valStr.isNotEmpty( )) {
            val usdValue = valStr.toDouble() / rate.toDouble()
            binding.amountTextView.text = "%.1f".format(usdValue)
        } else {
            Toast.makeText(applicationContext, "금액을 입력하세요",
                Toast.LENGTH_LONG).show()
        }
    }
}

//binding.convertButton.setOnClickListener {
//    val s = "   "
//    if (s.isNotBlank()) {
//        // if (s.isNotBlank()) {
//        binding.amountTextView.text = "문자열=$s, 길이=${s.length}"
//    } else {
//        Toast.makeText(applicationContext, "금액을 입력하세요",
//            Toast.LENGTH_LONG).show()
//    }
//}

//        binding.convertButton.setOnClickListener {
//            val wonValueStr: String = binding.wonEditText.text.trim().toString()
//            var wonValue:Double = wonValueStr.toDouble()
//            if (wonValueStr.contains('.')) {
//                val regex: Regex = "([0-9]+)(\\.)([0-9]*)".toRegex()
//                val res: MatchResult? = regex.matchEntire(wonValueStr)
//                if (res != null) {
//                    val (ip, p, fp) = res.destructured
//                    wonValue = ip.toDouble()
//                }
//            }
//            binding.amountTextView.text =
//                String.format("%.1f", wonValue / rate.toDouble())
//        }

//        binding.convertButton.setOnClickListener {
//            var wonValueStr: String = binding.wonEditText.text.toString()
//            // 정규 표현식
//            val regex: Regex = "([0-9]+)(\\.)?([0-9]*)".toRegex()
//            val res: MatchResult? = regex.matchEntire(wonValueStr)
//            if (res != null) {
//                val (ip, p, fp) = res.destructured
//                binding.amountTextView.text = "정수=$ip, 소수점=$p, 분수=$fp"
//            }
//        }

//binding.convertButton.setOnClickListener {
//            // wonValue 는 editable 타입이므로 우리가 사용할 수 있게 String 타입으로 변환.
//            val wonValue = binding.wonEditText.text.toString()
//            binding.wonEditText.setText("$wonValue 원")
////            val usdValue: Double = wonValue.toDouble() / rate.toDouble()
//            val usdValue: Double = round(wonValue.toDouble() / rate.toDouble())
//
////            binding.amountTextView.text = String.format("%.2f \$", usdValue)
//            binding.amountTextView.text = "%.2f \$".format(usdValue)
//}