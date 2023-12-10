package com.example.wordquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.forEach
import androidx.core.view.forEachIndexed
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wordquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var radioArray: Array<RadioButton>

    // ViewModel 을 사용하기 위한 코드. 기계적 Typing 필요.
    private val wordViewModel: WordViewModel by lazy {
        ViewModelProvider(this).get(WordViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        radioArray = arrayOf<RadioButton>(
            binding.radioButton1,
            binding.radioButton2,
            binding.radioButton3,
            binding.radioButton4
        )

        radioArray.forEachIndexed { idx, rb ->
            rb.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) checkAnswer(idx + 1)
            }
        }

        updateQuiz()
        binding.nextButton.setOnClickListener {
            wordViewModel.moveToNext()
            updateQuiz()
        }
        binding.prevButton.setOnClickListener {
            wordViewModel.moveToPrevious()
            updateQuiz()
        }
        binding.hintButton.setOnClickListener {

        }
    }

    private fun updateQuiz() {
        binding.wordTextView.text = wordViewModel.currentQuestion
        radioArray.forEachIndexed { idx, rb ->
            rb.text = wordViewModel.currentNumbers[idx]
        }
        binding.radioGroup.clearCheck()
    }

    private fun checkAnswer(usrAns: Int) {
        val correctAns = wordViewModel.currentAnswer
        val tmp =
            if (usrAns == correctAns)
                resources.getString(R.string.right_ans_msg)
            else
                resources.getString(R.string.wrong_ans_msg)
        Toast.makeText(applicationContext, tmp, Toast.LENGTH_SHORT).show()
    }
}