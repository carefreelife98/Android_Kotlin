package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.alertdialog.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = resources.getStringArray(R.array.colors)
        var statusArr = Array(items.size) { false }

        binding.callButton.setOnClickListener {
            MaterialAlertDialogBuilder(this@MainActivity)
                .apply { // scope function, this. 생략 가능
                    setTitle("색상 선택")
                    setIcon(R.drawable.ic_launcher)
                    setCancelable(false) // 뒤로 가기 버튼 사용 불가능.

                    setMultiChoiceItems(items, null) {
                            _, which, isChecked -> statusArr[which] = isChecked
                    }
                    setPositiveButton("SELECT") { _, _ ->
                        var s = ""
                        if (statusArr.none { it }) {
                            s += "아무것도 선택하지 않았습니다."
                        } else {
                            var tmp = ""
                            statusArr.forEachIndexed { index, b ->
                                if (b) tmp += "${items[index]} "
                            }
                            s += getString(R.string.color_selected, tmp)
                        }
                        binding.colorTextView.apply {
                            visibility = View.VISIBLE
                            text = s
                        }
                    }
                    setNegativeButton("CANCEL") { _, _ -> }
                    show()
            }
        }
    }
}