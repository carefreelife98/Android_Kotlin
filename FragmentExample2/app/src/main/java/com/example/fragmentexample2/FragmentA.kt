package com.example.fragmentexample2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentexample2.databinding.FragmentABinding
import kotlin.ClassCastException

class FragmentA : Fragment() {
    private lateinit var binding: FragmentABinding
    private val viewModel : MyViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MyViewModel::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.button.setOnClickListener {
            val word = binding.wordEditText.text.toString()
            viewModel.setWord(word)
        }
    }
}

//// interface 의 목적은 추상 메소드를 선언
//interface ListenerA {
//    fun sendWord(word: String)
//}
//
//private var activityCallback: ListenerA? = null
//
//override fun onAttach(context: Context) {
//        super.onAttach(context)
//        try {
//            if (context is ListenerA) activityCallback = context
//
//        } catch (e: ClassCastException) {
//            throw ClassCastException("$context did not implement Listener A")
//        }
//    }
//override fun onCreateView(
//    inflater: LayoutInflater, container: ViewGroup?,
//    savedInstanceState: Bundle?
//): View? {
//    binding = FragmentABinding.inflate(inflater, container, false)
//    binding.button.setOnClickListener {
//        val word = binding.wordEditText.text.toString()
//        activityCallback?.sendWord(word)
//    }
//    return binding.root
//}