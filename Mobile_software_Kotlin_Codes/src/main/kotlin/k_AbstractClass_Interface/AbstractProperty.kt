package k_AbstractClass_Interface

// 추상 클래스 Foo
abstract class Foo2 {
    // abstract property 는 선언만 진행. (초기값 할당 x)
    abstract var name: String

    // body 가 없는 Method 의 선언만 진행.
    abstract fun bar2()

    // 상속을 허용한 Method
    open fun openFunction() {
        println("openFunction() is implemented")
    }

    // 상속을 허용하지 않은 Method
    fun publicFunction() {}
}

// 추상 클래스 Foo 를 상속받은 클래스 Anonymous
class Anonymous2() : Foo2() {
    // 추상 클래스의 추상 속성 초기값 할당.
    override var name: String = "new name"

    // 추상 클래스의 추상 메소드를 구현
    override fun bar2() {
        println("bar2() is implemented")
        println("name = $name")
    }
}

fun main() {
    // Anonymous 클래스 객체 생성
    val foo = Anonymous2()

    // Anonymous Class
    foo.bar2()
    foo.openFunction()
}