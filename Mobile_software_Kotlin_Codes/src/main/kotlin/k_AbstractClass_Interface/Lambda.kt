package k_AbstractClass_Interface

fun add(a:Int, b:Int): Int = a + b
fun sub(a:Int, b:Int): Int = a - b

val addL = { x:Int, y:Int -> x + y }
//val addL = { x:Int, y:Int -> println(x + y) }
val subL = { x:Int, y:Int -> x - y }
//val subL = { x:Int, y:Int -> println(x - y) }


fun addOrSub(b:Boolean):(Int, Int) -> Int {
    if (b) {
        return addL
    } else {
        return subL
    }
//    else if (!b) {
//        return ::add
//    } else {
//        return ::sub
//    }
}

fun main() {
    // 함수 참조 시
    // 함수 참조 연산자 (::) 를 사용
    val addFunction:(Int, Int) -> Int = addOrSub(true)
    val subFunction:(Int, Int) -> Int = addOrSub(false)
//    val addFunction:(Int, Int) -> Int = addL
//    val subFunction:(Int, Int) -> Int = subL
//    val addFunction:(Int, Int) -> Unit = addL
//    val subFunction:(Int, Int) -> Unit = subL
    println(addFunction(9, 8))
    println(subFunction(4, 3))
}