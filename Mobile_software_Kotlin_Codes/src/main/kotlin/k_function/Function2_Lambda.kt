package k_function

class Function2_Lambda {

    fun add() {
        println("General Function")
    }

    val add: () -> Unit = { println("Add Operation") }


    val sub: () -> Unit = { println("Subtract Operation") }

    fun addOrSubtract(flag: Boolean, x:Int, y:Int, op:((Int, Int) -> String)?) {
        if (flag) {
            add()
            if (op != null)
                println(op(x, y))
            else
                println("OP is Null, Do Not Perform")
        }
        else {
            sub()
            if (op != null)
                println(op(x, y))
            else
                println("OP is Null, Do Not Perform")
        }
    }
}