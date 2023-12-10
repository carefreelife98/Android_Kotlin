package com.example.wordquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.wordquiz.databinding.ActivityHintBinding

class HintActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHintBinding
    private val hintViewModel : WordDictViewModel by lazy {
        ViewModelProvider(this).get(WordDictViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHintBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}