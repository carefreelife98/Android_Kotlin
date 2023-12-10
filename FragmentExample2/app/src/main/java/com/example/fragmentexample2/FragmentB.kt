package com.example.fragmentexample2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fragmentexample2.databinding.FragmentABinding
import com.example.fragmentexample2.databinding.FragmentBBinding


class FragmentB : Fragment() {
    private lateinit var binding: FragmentBBinding
    private val viewModel: MyViewModel by lazy {
        ViewModelProvider(requireActivity()).get(MyViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.word.observe(viewLifecycleOwner) {
            binding.textView.text = it
        }

//        binding.textView.text = viewModel.word

//        val resultObserver = object : Observer<String> {
//            override fun onChanged(value: String) {
//                binding.textView.text = value
//            }
//        }
    }
}

//        // arguments 가 null 이면 실행하지 않음 (let)
//        arguments?.let {
//            val word = it.getString(ARG_PARAM) // it == Bundle 객체
//            binding.textView.text = word
//        }
//  // companion object 로서 대체.
//    fun showWord(word: String) {
//        binding.textView.text = word
//    }

//    companion object {
//        // annotation. Compiler 에 대한 지시어. Static Method
//        // fragment B 의 argument 속성에 Bundle 객체를 담아 보낸다.
//        @JvmStatic
//        fun newInstance(word: String): FragmentB =
//            FragmentB().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM, word)
//                }
//            }
//    }

//        @JvmStatic
//        fun newInstance(word: String): FragmentB {
//            val fragB = FragmentB()
//            val bundle = Bundle()
//            bundle.putString(ARG_PARAM, word)
//            fragB.arguments = bundle
//            return fragB
//        }
