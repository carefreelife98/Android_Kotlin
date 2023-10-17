package k_basicTypes

class NumbersEx {
    fun ex1(){
        println("Byte: MIN_VALUE=${Byte.MIN_VALUE}, MAX-VALUE=${Byte.MAX_VALUE}")
//        println(Byte.MAX_VALUE)
//        println(Byte.MIN_VALUE)
    }

    fun ex2ChangeType(){
        val b = 0b011111
        val i2b:Byte = b.toByte()
        println("b=${b}, i2b=${i2b}")
        println("2진수 변환=${i2b.toString(2)}, 16진수 변환=${i2b.toString(16)}") // 2진수, 16진수 변환 한번에 출력
//        println(i2b.toString(16)) //16진수
        val f = 3.9f
        println("$f 를 정수로 변환하면 ${f.toInt()}")
    }

    fun ex3typeCheck(v:Any){ // 형식 인자에는 val & var를 지정하지 않는다.
        when (v){ // Java 의 Switch-Case 와 비슷함. Break 존재하지 않는다.
            is Short -> println("The Type od $v is Short.")
            is Int -> println("The Type od $v is Int.")
            is Float -> println("The Type od $v is Float.")
            is Double -> println("The Type od $v is Double.")

            else -> println("unknown type")
        }
    }
}