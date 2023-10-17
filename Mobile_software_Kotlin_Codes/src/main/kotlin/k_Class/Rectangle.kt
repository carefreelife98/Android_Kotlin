package k_Class

class Rectangle(_shape: String,
                _height: Int,
                _width: Int) {

    // getter & setter 정의
    val shape: String = _shape
        get() = field // field = keyword. shape property 를 가리킴.

    var height: Int = _height
        get() = field
        set(value) {
            field = value // field == height
        }

    var width: Int = _width
        get() = field
        set(value) {
            field = value // field == width
        }
}

fun main() {
    val rect = Rectangle("Rectangle", 30, 30)
    rect.height = 40 // getter 호출한 것
    rect.width = 40 // setter 호출한 것
    println("${rect.shape}, ${rect.width}, ${rect.height}") // getter
}