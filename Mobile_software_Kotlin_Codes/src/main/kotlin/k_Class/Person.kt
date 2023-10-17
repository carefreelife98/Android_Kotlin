package k_Class

// Primary constructor - class 생성 시에 class 속성을 함께 선언
class Person(var name: String,
             var age: Int,
             var isMarried: Boolean) {
    var nickName: String = ""
    init {
        println("Beginning of init block")
        println("이름=$name, 나이=$age")
        println("End of init block")
    }

    // nickName 속성을 위한 Secondary constructor 생성
    // 4개의 속성 중 주 생성자에서 이미 초기화 된 속성은 그대로 사용. (= :this(_name, _age, _isMarried)
    // 주 생성자에서 초기화 되지 않은 nickName 속성은 아래의 보조 생성자에서 추가적으로 초기화.
    constructor(_name:String, _age:Int, _isMarried:Boolean, _nickName:String)
            :this(_name, _age, _isMarried) { // 주 생성자의 도움을 받아 주 생성자와 동일하게 초기화 할 것
        this.nickName = _nickName
    }

    // method 는 Class body 내부에 작성해야 함.
    fun getName() = println("The name is $name.")
}

fun main() {
    // 첫번째 Constructor 사용 (Parameter 3개)
    val chae = Person("Chae", 26, false, "CarefreeLife")
    println("${chae.name}, ${chae.age}, ${chae.isMarried}, ${chae.nickName}")
//
//    // 두번째 Constructor 사용 (Parameter 2개  )
//    val kim = assignment.hw1.Person("Kim", 27)
//    chae.getName()
}

//    // 3개 Properties 속성 초기화
//    var name: String
//    var age: Int
//    var isMarried: Boolean

//    // secondary constructor.
//    // Secondary constructor 에 전달되는 Parameter 이름과 class 속성 이름을 다르게 지정하면
//    // 둘 사이의 구분이 되므로 this. 을 생략할 수 있게 된다. (this 는 현재 객체를 나타냄)
//    constructor(_name: String, _age: Int, _isMarried: Boolean) {
////        this.name = _name
////        this.age = _age
////        this.isMarried = _isMarried
//        name = _name
//        age = _age
//        isMarried = _isMarried
//    }
//
//    // secondary constructor 는  인자 값을 다르게 주어 여러 개 생성 가능.
//    constructor(_name: String, _age: Int) {
//    //        this.name = _name
//    //        this.age = _age
//    //        this.isMarried = _isMarried
//            name = _name
//            age = _age
//            isMarried = true // default 값.
//    }