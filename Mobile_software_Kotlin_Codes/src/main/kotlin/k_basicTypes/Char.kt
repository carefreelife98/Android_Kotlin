package k_basicTypes

class char {

    fun char(){
        val code:Int = 65 // 문자 'A'의 ASCII Code
        val hanCodeFirst:Char = '\uac00' // UNICode - 첫 번째 한글 음절 '가'
        val hanCodeLast:Char = '\ud7a3' // UNICode - 마지막 한글 음절 '힣'

        println("${code.toChar()}, ${(code+1).toChar()}") // A, B
        println("$hanCodeFirst, $hanCodeLast") // '가', '힣'
    }

    fun char1(){
        for (i in 48..60){
            val c = i.toChar()
            if (c.isDigit()) print(c)
            else print ('*')
        }
        println()

        for (i in 65..90) {
            print("${i.toChar()} ")
        }
        println()
    }

    fun char_warn(){
//        println('0'.toInt()) // Deprecated 됨.
        println('0'.code) // 해당 숫자가 아닌 숫자의 ASCII Code 를 출력함.
        println('0'.digitToInt()) // 대안
    }
}