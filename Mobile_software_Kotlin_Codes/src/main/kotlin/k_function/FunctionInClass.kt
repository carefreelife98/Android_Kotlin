package k_function

class FunctionInClass {
    fun add(x:Int, y:Int) = x + y
//    val addL = {x:Int, y:Int -> x + y }

    // 세 가지 방법 존재
//    val addL:(x:Int) -> Int = { it + 3 }
//    val addL = { x:Int -> x + 3 }
    val addL:(Int) -> Int = { x -> x + 3 }

    //    val subL = {x:Int, y:Int -> x - y }
    val subL:(x:Int) -> Int = { it - 4 }

    fun add1(x:Int, y:Int) = x + y
    fun sub1(x:Int, y:Int) = x - y

    // 고차 함수 : 변수가 아닌 함수를 Return 한다.
    fun addOrSubLambda(b: Boolean): (Int) -> Int { // function type
        if (b) {
            return addL
        } else {
            return subL
        }
    }

    fun addOrSub(b: Boolean): (Int, Int) -> Int { // function type
        if (b) {
            return ::add1
        } else {
            return ::sub1
        }
    }

    fun addOrSubOp(a:Int, b:Int, op: (Int, Int) -> Int): Int {
        return op(a, b)
    }
}