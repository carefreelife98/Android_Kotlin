package k_basicTypes

class Number {
    fun number(){
        val b = 980116
        val i:Byte = b.toByte()
        println("${b.toString(2)}, ${b.toString(16)}, $i")

        val f = i.toFloat()
        println("int $i becomes Float $f")
    }

    fun quiz_1(){
        val f = 3.14f
        val d = 2.718

//        val s:Short = f.toShort() // 에러 발생 원인 : Int 로 먼저 형변환 해줘야 함.
//        val b:Byte = d.toByte() // 에러 발생 원인 : Int 로 먼저 형변환 해줘야 함.
    }
}