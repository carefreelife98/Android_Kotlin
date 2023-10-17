package com.example.inclass_layouttest

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val set = ConstraintSet()

        val myTextView = TextView(this)
        myTextView.text = "Carefree Life!"
        myTextView.textSize = 24f
        myTextView.id = R.id.textView

        set.constrainWidth(myTextView.id, ConstraintSet.WRAP_CONTENT)
        set.constrainHeight(myTextView.id, ConstraintSet.WRAP_CONTENT)

        set.connect(myTextView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
        set.connect(myTextView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        set.connect(myTextView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 0)
        set.connect(myTextView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0)


        // context = 화면 = Activity
        val myButton = Button(this)
        myButton.text = "Button"
        myButton.textSize = 20f
        myButton.id = R.id.myButton
        set.constrainWidth(myButton.id, ConstraintSet.WRAP_CONTENT)
        set.constrainHeight(myButton.id, ConstraintSet.WRAP_CONTENT)
        set.connect(myButton.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
        set.connect(myButton.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)

        // Button 의 상단에는 TextView 가 존재하므로 myTextView.id 를 통해 TextView 를 알려준다.
        set.connect(myButton.id, ConstraintSet.TOP, myTextView.id, ConstraintSet.TOP, 0)

        val myLayout = ConstraintLayout(this)
        myLayout.addView(myButton)
        myLayout.addView(myTextView)

        setContentView(myLayout)
    }
}