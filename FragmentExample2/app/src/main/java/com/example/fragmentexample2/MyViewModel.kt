package com.example.fragmentexample2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// livedata 사용
class MyViewModel: ViewModel() {
    // (Mutable) LiveData 사용
    private var _word: MutableLiveData<String> = MutableLiveData("전달된 문자열")
    val word: LiveData<String>
        get() = _word

    fun setWord(s: String) {
        // Livedata 를 사용할 시 .value 를 사용하여 Data 를 사용해야 한다.
        _word.value = s
    }

}