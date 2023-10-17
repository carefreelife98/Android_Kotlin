package k_AbstractClass_Interface

// interface Clickable
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}

// interface Focusable
interface Focusable {
    fun setFocus(b:Boolean)
    fun showOff() = println("I'm focusable")
}

// 다중 상속. Interface 는 콤마 (,) 를 통해 구분됨.
class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun setFocus(b: Boolean) {
        println("I ${if (b) "got" else "lost"} focus.")
    }

    // Interface 중 같은 이름을 가진 Method 존재 시
    // 해당 Method 에 T Type Parameter <> 를 사용하여 Interface 구분.
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button:Button = Button()
    button.setFocus(true)
    button.showOff()
    button.click()
}