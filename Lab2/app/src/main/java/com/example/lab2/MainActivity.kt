package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private var resultStr = ""

//    val resultStrArr = ArrayList<String>()
    val resultStrArr = mutableSetOf<String>()
    val orderCount = arrayListOf<String>()
//    val orderCount = mutableSetOf<String>("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val coffeeArr: Array<String> = resources.getStringArray(R.array.coffee_menus)
        val orderedList = arrayListOf<CheckBox>(binding.americanoCheckBox, binding.latteCheckBox, binding.decafCheckBox)
        val qtyArr = arrayListOf<Int>(1, 2, 3, 4, 5, 6)
        val adapter: ArrayAdapter<Int> = ArrayAdapter<Int>(this, android.R.layout.simple_spinner_item, qtyArr)
        orderedList.forEachIndexed { i, cb ->
            cb.text = coffeeArr[i]
        }

        val bool = Array(coffeeArr.size) {false}
        orderedList.forEachIndexed { i, cb ->
            cb.setOnCheckedChangeListener { _, isChecked ->
                bool[i] = isChecked
                resultStrArr.add(coffeeArr[i])
            }
        }

        binding.apply {
            spinner.adapter = adapter
            spinner2.adapter = adapter
            spinner3.adapter = adapter
        }
        binding.apply {
            spinner.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?, position: Int, id: Long
                    ) {
                        val count:String = parent?.getItemAtPosition(position).toString()
                        if (count.isNotEmpty())
                            orderCount.add(count)
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {}
                }
            spinner2.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?, position: Int, id: Long
                    ) {
                        val count:String = parent?.getItemAtPosition(position).toString()
                        if (count.isNotEmpty())
                            orderCount.add(count)
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {}
                }
            spinner3.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?, position: Int, id: Long
                    ) {
                        val count:String = parent?.getItemAtPosition(position).toString()
                        if (count.isNotEmpty())
                            orderCount.add(count)
                    }

                    override fun onNothingSelected(p0: AdapterView<*>?) {}
                }
        }

        binding.selectButton.setOnClickListener {
            showToast()
            orderCount.clear()
            resultStrArr.clear()
        }
    }

    fun showToast() {
        if (resultStrArr.isEmpty()) {
            Toast.makeText(this, "You should order at least 1 drink.", Toast.LENGTH_SHORT).show()
        } else {
            var resultStr = ""
            var resultOrderCount = ""
            resultStrArr.forEachIndexed { i, s: String -> resultStr += s }
            orderCount.forEachIndexed { i, s ->
                if (s != "1") {
                    resultOrderCount += s
                }
            }
            Toast.makeText(this, "You ordered ${resultStr} each for ${orderCount} Thanks!", Toast.LENGTH_SHORT).show()
        }
    }
}