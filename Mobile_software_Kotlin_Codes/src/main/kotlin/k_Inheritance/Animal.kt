package k_Inheritance

open class Animal () {
    var color: String = ""

    constructor(_color: String): this() {
        color = _color
    }
}

class Dog: Animal {
    var breed: String = ""

    constructor(_color: String, _breed: String) : super(_color) {
        breed = _breed
    }
}

fun main() {

}



//class Cat: Animal() {
////    var color: String = ""
////    fun eat() = println("Eat")
//    var age: Int = -1
//    fun meow() = println("Meow")
//}
