package k_arrays

class oneDimensionArrInClass {
    val arr = arrayOf<Int>(1, 2, 4)
    val arrBool:Array<Boolean> = arrayOf<Boolean>(true, false, true)
    val arrChar:Array<Char> = arrayOf<Char>('c', 's', 'm')

    // intArrayOf 사용시 Type 자체도 IntArray 라는 특정 Type을 사용하게 됨.
    val arr2:IntArray = intArrayOf(3, 4, 5, 6)

    // 마찬가지
    val arr3:BooleanArray = booleanArrayOf(true, false, false)

    fun lambdaWithArray() {
        // Lambda 식을 사용한 배열
        val arr4 = Array<Int>(8, { it -> it * 2 }) // 생성자
        // val arr4 = Array<Int>(8, { it * 2 }) // Lambda 의 형식 인자 종류가 하나인 경우 생략 가능

        println(arr4.contentToString())

        arr4.forEach { element ->
            println("$element")
        }

        arr4.forEachIndexed { index, element ->
            if (element % 2 == 0) {
                println("arr[$index] = $element ")
            }
        }
    }
}