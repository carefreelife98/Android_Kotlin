package com.example.wordquiz

import androidx.lifecycle.ViewModel

// app 과 생명 주기를 같이 한다.
// ViewModel : Data 관리
class WordViewModel : ViewModel() {
    private var currentIndex = 0
    private val wordBank: List<Word> = listOf<Word>(
        Word("부주의한, 소홀한", arrayOf("degenerate", "unity", "inadvertent", "array"), 3),
        Word("쇠약하게 하다", arrayOf("vanity", "underhand", "enslave", "debilitate"), 4),
        Word("(위험·곤란)제거하다", arrayOf("artisan", "sadistic", "glossy", "obviate"), 4),
        Word("우아한", arrayOf("prostrate", "delude", "urbane", "renowned"), 3),
        Word("활기있게 하다", arrayOf("bereave", "enliven", "occult", "besiege"), 2)
    )

    // Read-Only
    val currentQuestion get() = wordBank[currentIndex].question
    val currentNumbers get() = wordBank[currentIndex].numbers
    val currentAnswer get() = wordBank[currentIndex].answer

    // currentIndex 변경 로직
    fun moveToNext() {
        currentIndex = (currentIndex + 1) % wordBank.size
    }

    fun moveToPrevious() {
        if (currentIndex == 0) {
            currentIndex = wordBank.size - 1
        } else {
            currentIndex -= 1
        }
    }
}