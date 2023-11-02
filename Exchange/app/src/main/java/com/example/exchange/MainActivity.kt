package com.example.exchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.TextView.OnEditorActionListener
import android.widget.Toast
import com.example.exchange.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var rate = ""
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rate = getString(R.string.exchange_rate)
        binding.currentRateTextView.text = rate

        // Soft Keyboard 의 Enter 키 기능 Customizing
        binding.wonTextInputEditText.setOnEditorActionListener( object : OnEditorActionListener {
            override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    doExchangeCurrency((v as EditText).text.toString())
                    return true
                }
                return false
            }
        })

        // button click listener
        binding.convertButton.setOnClickListener {
            val wonValue: String = binding.wonTextInputEditText.text?.trim().toString()
            doExchangeCurrency(wonValue)
        }
    }

    private fun doExchangeCurrency(valueStr: String?): Unit {
        if (valueStr == null) return
        if (valueStr.isNotBlank()) {
//            val bgColor = getColor(R.color.color_background)
//            binding.viewGroup.setBackgroundColor(bgColor)

            val usd: Double = valueStr.toDouble() / rate.toDouble()
            val tvColor = getColor(R.color.color_textview)
            val txSize = resources.getDimension(R.dimen.textview_size)

            // Scope Function : 같은 객체를 여러번 사용 할 시에 사용.
            binding.amountTextView.apply {
                text = "%.2f \$".format(usd)
                setTextColor(tvColor)
                textSize = txSize
            }
//            binding.amountTextView.text = "%.2f \$".format(usd)
//            binding.amountTextView.setTextColor(tvColor)
//            binding.amountTextView.textSize = txSize
        } else {
            Toast.makeText(applicationContext, "금액을 입력하세요",
                Toast.LENGTH_LONG).show()
        }
    }
}