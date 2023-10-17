package k_basicTypes

import kotlin.math.PI

class string {
    fun string(){
        val foo: String = "My First Kotlin"
        val c: Char = 's'

//        println(foo.length)
        val size = foo.length
        println("first char = ${foo[0]}, last char = ${foo[size-1]}") // indexing (Kotlin 에서 권장하는 방법)
//        println("${foo.get(0)}, ${foo.get(size-1)}") // getter, 권장하지 않음

        val ch1: Char = foo.get(3)
        val ch2: Char = foo[9]
        println("length = $size, ch1 = $ch1, ch2 = $ch2")

        for(i in 0 until size)
            print(foo[i])
        println()
    }

    fun string2() {
        val foo: String = "My First Kotlin"

        println(foo[9])
        println(foo.substring(0, 9) + "Python") // 0 ~ 8 까지
        println(foo)

        val foo2 = foo.replace("Kotlin", "C++")
        println(foo2)
        println(foo == foo2)
    }

    fun string3() {
        val pi = PI.toFloat() // Double
        val digit = 10
        val str = "CarefreeLife"
        val c = '\uAC00'
        val length = 3000


        // 서식 지정: .format("String, %(숫자: 출력 시 해당 칸 수 만큼 띄어줌)변수 타입", 변수)
        val lengthStr: String = String.format("길이 = %5d meters", length)
        // %.4f : 소수점 아래 4 자리수에서 반 올림 하여 해당 자리까지 출력
        println("pi = %.4f %3d %10s %c".format(pi, digit, str, c))
        println(lengthStr)
    }

    fun string4() {
        val amount = "10"

        println("가격은 USD \$ $amount") // escape character \ . 특수 문자 출력
    }

    fun string5() {
        var a = 1
        val s1 = "a is $a"

        a = 2
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)

        val s = "abc"
        println("$s.length is ${s.length}")
    }

    fun string6() {
        val expr = "My First Kotlin"
        val amount = 10

        val lengthStr = "test length: ${expr.length}"
        val priceStr = "price : USD ${'$'}$amount"
        val priceStr2 = "price : USD \$$amount"

        println(lengthStr)
        println(priceStr)
        println(priceStr2)
    }
}