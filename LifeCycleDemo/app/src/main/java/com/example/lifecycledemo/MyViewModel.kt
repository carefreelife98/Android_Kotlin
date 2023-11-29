package com.example.lifecycledemo

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var _userName : String = ""

    // backing property
    val userName : String get() = _userName

    fun saveUserName(s: String) { // setter
        this._userName = s
    }

//    fun getUserName() : String? {
//        return userName
//    }
}