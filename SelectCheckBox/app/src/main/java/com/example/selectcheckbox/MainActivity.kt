package com.example.selectcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Toast
import com.example.selectcheckbox.databinding.ActivityMainBinding
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val planets = resources.getStringArray(R.array.planets_array)
        val planetID: Array<Int> = arrayOf(
            R.drawable.mercury, R.drawable.venus, R.drawable.earth,
            R.drawable.mars, R.drawable.jupiter, R.drawable.saturn,
            R.drawable.uranus, R.drawable.neptune
        )

        val adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item,
            planets)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // 어떤 아이템을 선택했니?
                val planet = parent?.getItemAtPosition(position).toString()

                // position 값이 매우 중요한 항목.
                binding.imageView.setImageResource(planetID[position])
             }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}
