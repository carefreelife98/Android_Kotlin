package com.example.fragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FragmentA.ButtonListener {
    private lateinit var binding: ActivityMainBinding

    // fragment A 의 interface 추상 메소드 구현
    override fun onButtonClick() {
        // Fragment B 로 바꿈
        supportFragmentManager.beginTransaction().apply {
            this.replace(R.id.fragment_container, FragmentB())
            this.addToBackStack(null)
            this.commit()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fr: Fragment? = supportFragmentManager.findFragmentById(R.id.fragment_container)
        // 어떠한 Fragment 가 배치되어 있지 않으면 FragmentA 를 배치
        if (fr == null) {
            supportFragmentManager.beginTransaction().apply {
                this.add(R.id.fragment_container, FragmentA()) // transaction 객체 생성 (Single tone)
                this.addToBackStack(null)
                this.commit()
            }
        }

        binding.button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                this.replace(R.id.fragment_container, FragmentA())
                this.addToBackStack(null) // 뒤로 가기 버튼 누를 시 이전 동작을 반환 하기 위한 Stack
                this.commit()
            }
        }
        binding.button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                this.replace(R.id.fragment_container, FragmentB())
                this.addToBackStack(null)
                this.commit()
            }
        }
    }
}