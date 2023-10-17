package in_class.class_0921

import kotlin.String

class NULL_class {
    fun null_1() {
        var singer:String? = null // Nullable Type

        val size = singer?.length
        print(size)

//        // Java Style Code
//        if (singer != null) {
//            val size = singer.length
//        }
    }

    fun elvisOperator() {
        var singer:String? = null // Nullable Type

        val size = singer?.length ?: 0 // Elvis Operator
        print(size)

//        // Java Style Code
//        if (singer != null) {
//            println(singer.length)
//        }
//        else print(0)
    }
}