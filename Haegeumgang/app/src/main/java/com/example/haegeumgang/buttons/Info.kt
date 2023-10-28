//package com.example.haegeumgang.buttons
//
//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.ImageView
//import android.widget.TextView
//import com.example.haegeumgang.InfoActivity
//import com.example.haegeumgang.TAG
//
//
//
//
//class Info : InfoActivity() {
//
//    private lateinit var temp: Pair<ImageView, TextView>
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        while (true) {
//            temp = queue.peek()!!
//            Log.d(TAG, "queue = $queue , peek = $temp")
//            if ((temp.first.visibility == View.VISIBLE) and (temp.second.visibility == View.VISIBLE)) {
//                temp.first.visibility = View.INVISIBLE
//                temp.second.visibility = View.INVISIBLE
//                queue.add(temp)
//            } else {
//                temp.first.visibility = View.VISIBLE
//                temp.second.visibility = View.VISIBLE
//                break
//            }
//        }
//    }
//    fun next() {
//        while (true) {
//            Log.d(TAG, "queue = $queue , peek = $temp")
//            if (temp != null) {
//                if ((temp.first.visibility == View.VISIBLE) and (temp.second.visibility == View.VISIBLE)) {
//                    temp.first.visibility = View.INVISIBLE
//                    temp.second.visibility = View.INVISIBLE
//                    queue.add(temp)
//                } else {
//                    temp.first.visibility = View.VISIBLE
//                    temp.second.visibility = View.VISIBLE
//                    break
//                }
//            }
//        }
//    }
//    fun previous() {}
//}

