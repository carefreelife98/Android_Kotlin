package assignment.hw1

class Function {
    fun p3(length: Int, width: Int): Int {
        return length * width
    }

    fun p3_3(length: Int, width: Int): Unit {
        println(length * width)
    }

    fun p4(a: Int, b: Int) = a + b

    fun p5(a: Int, b: Int): Int = if (a > b) a else b

    fun p6(a: Int = 4, b: Int = 6): Int {
        if (a > b) {
            return a
        } else {
        }
        return b
    }

    fun p7(a: Int = 2, b: Int = 3) {
        println("sum of $a and $b is ${a + b}")
    }

    fun p8(length: Int, width: Int, height: Int = 10) = length * width * height

    fun p9(vararg values: Int): Int {
        var sum = 0
        for (num in values) {
            sum += num
        }
        return sum
    }

    fun p13() {
        val add = { x: Int, y: Int -> x + y }
        add(1, 3)
    }

    fun p14() {
        val add = { println("Lambda expression") }
        add()
    }

    fun p15() {
        val sub: () -> Unit = {
            println("Subtract Operation")
        }
        sub()
    }

    fun p16() {
        val add = { println("add operation") }
        val sub = { println("subtract operation") }

        val addFunction = add
        add()
        sub()
    }

    fun p17(flag: Boolean): () -> Unit {
        val add: () -> Unit = {
            println("add operation")
        }
        val sub: () -> Unit = { println("subtract operation") }

        if (flag) return add
        else return sub
    }

    fun p18() {
        val addOp: (Int, Int) -> String = { a, b -> "$a + $b = ${a + b}" }
        val subOp: (Int, Int) -> String = { a, b -> "$a - $b = ${a - b}" }

        p18a(2, 3, addOp)
        p18a(7, 2, subOp)
    }

    fun p18a(x: Int, y: Int, op: (Int, Int) -> String) {
        println(op(x, y))
    }

    fun p19() {
        val addOp: (Int, Int) -> String = { a, b -> "$a + $b = ${a + b}" }
        val subOp: (Int, Int) -> String = { a, b -> "$a - $b = ${a - b}" }

    }

    fun p19a(x: Int, y: Int, op: ((Int, Int) -> String)?) {
        if (op != null) {
            println(op(x, y))
        } else {
        }
        println("Do not perform the specified operation")
    }

    fun p20() {
        val myLambda: (Int, Int) -> Int = {x, y -> x + y}
        p20a(myLambda)
        p20a { x, y -> x + y}
    }

    fun p20a(myFunc:(Int, Int)->Int):Int {
        return myFunc(23, 24)
    }

    fun p21() {
        val add = fun(a:Int, b: Int): Int = a + b
        println(add(2, 3))
    }

    fun p22() {
        println(p22a(10, 2))
        println(p22a(3, 4))
    }

    inline fun p22a(a: Int, b: Int): Int = a + b

    fun Student.isScholar(score: Int): Boolean {
        return score > 90
    }

    fun p25() {
        // Create an Instance of the Class Student
        val Chae = Student()
        println("Pass status: ${Chae.hasPassed(88)}")

        // Extension function 사용
        println("Scholarship status: ${Chae.isScholar(95)}")
    }

    // Predefined Class 인 "String" Class 에 "add" 확장 함수 추가.
    fun String.add(s1: String): String {
        // this : add 메소드를 호출한 객체인 "String" 을 나타냄.
        return this + s1
    }

    fun p26() {
        val s: String = "Hello, "
        val s1: String = "Kotlin!"
        println(s.add(s1))
    }
}

class Student {
    fun hasPassed(score: Int): Boolean {
        return score > 60
    }

    // 직접 클래스 내부에 선언하지 않고 확장 함수로 추가 가능
    //    fun isScholar(score: Int): Boolean {
    //        return score > 90    //    }
}