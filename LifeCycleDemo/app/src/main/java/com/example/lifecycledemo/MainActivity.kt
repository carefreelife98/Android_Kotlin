package com.example.lifecycledemo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycledemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // 동반 객체
    companion object {
        private const val TAG = "Orientation"
        private const val KEY_TEXT = "last_name"
    }

    private lateinit var binding: ActivityMainBinding

    // View Model 의 소유자는 누구인가?
    private val viewModel: MyViewModel by lazy {
        // View Model 의 소유자는 MainActivity (= this)
        ViewModelProvider(this).get(MyViewModel::class.java) //reflection
    }

    // onCreate 만 유일하게 Parameter 가 존재.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate() 호출")

        // shared preference 사용
//        val settings = getPreferences(MODE_PRIVATE)
//        val userName = settings.getString(KEY_TEXT, "")
//        binding.nameEditText.setText(userName)
        binding.nameEditText.setText(viewModel.userName)

//        if (savedInstanceState?.isEmpty == false) {
//            val userName = savedInstanceState.getString(KEY_TEXT)
//            binding.nameEditText.setText(userName)
//        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() 호출")

        // viewModel 사용
        viewModel.saveUserName(binding.nameEditText.text.toString())
// //shared preference 사용
//        val settings: SharedPreferences = getPreferences(MODE_PRIVATE)
//        val editor: SharedPreferences.Editor = settings.edit() // 값을 추가하는 Editor 객체 생성
//        val userName: String = binding.nameEditText.text.toString()
//
//        editor.putString(KEY_TEXT, userName)
//        editor.commit()
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.d(TAG, "onSaveInstanceState() 호출")
//
//        val userName: String = binding.nameEditText.text.toString()
//        outState.putString(KEY_TEXT, userName)
//    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState() 호출")

        val userName = savedInstanceState.getString(KEY_TEXT)
        Toast.makeText(applicationContext, "$userName", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() 호출")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() 호출")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() 호출")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() 호출")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() 호출")
    }
}
