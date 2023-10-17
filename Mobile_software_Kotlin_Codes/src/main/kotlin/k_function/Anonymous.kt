package k_function

class Anonymous {

    fun hasPassed(score: Int): Boolean {
        return score > 60
    }

    // 직접 클래스 내부에 선언하지 않고 확장 함수로 추가 가능
    //    fun isScholar(score: Int): Boolean {
    //        return score > 90
    //    }

    fun String.add(s1: String): String {
        // this : add 메소드를 호출한 객체인 "String" 을 나타냄.
        return this + s1
    }

    fun extensionFunc() {
        val s: String = "Hello, "
        val s1: String = "Kotlin!"
        println(s.add(s1))
    }
}

// 확장 함수 추가
// fun (추가할 클래스).(확장 함수 이름) { 확장 함수 코드 }
fun Anonymous.isScholar(score: Int): Boolean {
    return score > 90
}