package k_Inheritance

open class Base {
    private var a = 1
    protected fun baseFun() {
        a += 1
        println("a = $a")
    }
}

class Derived : Base() {
    fun derivedFun() {
        super.baseFun()
    }
}

fun main() {
    val derived = Derived()
//    derived.a = 2
    derived.derivedFun()
}