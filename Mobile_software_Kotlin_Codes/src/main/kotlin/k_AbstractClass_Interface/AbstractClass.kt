package k_AbstractClass_Interface

// 추상 클래스 Foo
abstract class Foo {

    // body 가 없는 Method 의 선언만 진행.
    abstract fun bar()
}

// 추상 클래스 Foo 를 상속받은 클래스 Anonymous
class Anonymous : Foo() {

    // 추상 클래스의 추상 메소드를 구현
    override fun bar() {
        println("bar() is implemented")
    }
}

fun main() {
    // Anonymous 클래스 객체 생성
    val foo = Anonymous()

    // Anonymous Class
    foo.bar()
}