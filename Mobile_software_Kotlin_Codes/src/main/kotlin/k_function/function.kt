package k_function

class Function {
    fun add(a: Int, b: Int) = a + b

    fun max(a: Int, b: Int) = if(a > b) a else b

    fun maxQuiz(a: Int, b: Int) = if(a > b) {
        a
    } else {
        b
    }

    fun addVoid(a: Int, b: Int): Unit {
        println("${a + b}")
    }

    fun findVolume(length: Int, width: Int, height: Int = 10) = length * width * height

    // 가변 인자 : 인자의 개수가 변할 수 있다.
    // 여러 개의 인자가 입력될 수 있으므로 배열로서 구현됨.
    fun addWithVararg(vararg values: Int): Int {
        var sum = 0
        for (e in values) {
            sum += e
        }
        return sum
    }
}