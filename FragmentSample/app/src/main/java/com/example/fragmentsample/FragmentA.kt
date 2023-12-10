package com.example.fragmentsample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsample.databinding.FragmentABinding
import java.lang.Exception

class FragmentA : Fragment() {
    private lateinit var binding: FragmentABinding

    interface ButtonListener {
        fun onButtonClick()
    }
    private var activityCallBack: ButtonListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            if (context is ButtonListener) {
                activityCallBack = context
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.button3.setOnClickListener {
            // HostActivity.onButtonClick()
            activityCallBack?.onButtonClick()
        }
        return binding.root
    }
}