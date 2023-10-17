package in_class.class_0921

import kotlin.String

class String {
    fun string() {
        val s: String = "My First Kotlin"
        val size = s.length

        for (i in 0 until size) {
            print("${s[i]} ") // indexing
        }
    }

    fun string2() {
        val s: String = "My First Kotlin"
        val size = s.length

        for (i in 0 until size) {
            if (s[i].isWhitespace()) {
                print("${s[i]}")
            }
        }
    }

    fun string3() {
        val s: String = "My First Kotlin"
        val size = s.length

        val t = s.substring(0, 9)
        println(t + "Python")

        val t2 = s.replace("Kotlin", "Swift")
        print(t2)
    }
}