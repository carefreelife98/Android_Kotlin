package com.example.haegeumgang

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.haegeumgang.databinding.ActivityInfoBinding
import java.util.LinkedList
import java.util.Queue

const val TAG = "LOG DEBUG"

open class InfoActivity : MainActivity(), View.OnClickListener {

    private lateinit var infoBinding: ActivityInfoBinding
    private lateinit var infoSet: Triple<Pair<ImageView, TextView>, Pair<ImageView, TextView>, Pair<ImageView, TextView>>
    private lateinit var queue: Queue<Pair<ImageView, TextView>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        infoBinding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(infoBinding.root)

        infoBinding.next.setOnClickListener(this)
//        infoBinding.previous.setOnClickListener(this)
        infoBinding.exitInfoButton.setOnClickListener(this)

        infoSet = Triple(
            Pair(infoBinding.infoView, infoBinding.infoTextView1),
            Pair(infoBinding.infoView2, infoBinding.infoTextView2),
            Pair(infoBinding.infoView3, infoBinding.infoTextView3)
        )

        queue = LinkedList(listOf(infoSet.first, infoSet.second, infoSet.third))
        Log.d(TAG, "Init Queue = $queue")
    }

    override fun onClick(v: View?) {
//        Log.d(TAG, "onClick(v) = onClick($v)")
        when (v) {
            infoBinding.next -> { next() }
            infoBinding.exitInfoButton -> { finish() }
        }
    }

    fun next() {
        Log.d(TAG, "Info Activity - next() Exec.")
        val currentPair = queue.poll()!!
        val nextPair = queue.peek() // 다음에 나타날 Pair를 확인

        currentPair.first.visibility = View.INVISIBLE
        currentPair.second.visibility = View.INVISIBLE

        queue.offer(currentPair)

        if (nextPair != null) {
            nextPair.first.visibility = View.VISIBLE
            nextPair.second.visibility = View.VISIBLE
        } else {
            Log.d(TAG, "Info Activity - next() Exit.")
            finish()
        }
    }
}

