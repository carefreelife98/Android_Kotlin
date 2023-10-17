package in_class.class_1005

// 주 생성자 사용
class Student(val name: String,
              var age: Int,
              var grade: Int = 1) {
    // primary constructor 초기화 후 statement 가 필요할 때 사용.
    // 사용하지 않아도 무관. 초기화와 상관없음.
    init {
        println("at the beginning of init block")
        println("Your name is $name, age : $age, grade : $grade")
        println("the end of init block")
    }


    // this() 의 n, a, g 는 주 생성자에서 초기화한 값 그대로 사용.
    // _nickName 만 보조 생성자에서 초기화 하여 사용.
    var nickName: String = ""
    constructor(n:String, a:Int, g: Int, _nickName: String) : this(n, a, g) {
        nickName = _nickName
        println("nickName = $nickName")
    }

    fun getName() = println("Your name is $name, age : $age, grade : $grade")
}

fun main() {
    // class 와 instance 는 1:n 관계
    val chae = Student("Chae", 26, 4, "CarefreeLife")
    chae.getName()
}

// 보조 생성자 사용
class StudentSecondary {
    // property. 선언과 동시에 초기화 할 것.
    val name: String
    var age: Int

    // default value
    var grade: Int = 1

    // special function : Secondary constructor
    constructor(s:String, a:Int, g:Int) {
        name = s
        age = a
        grade = g
    }

    // Generally use underscore (_)
    constructor(_name:String, _age:Int) {
        name = _name
        age = _age
//        grade = 1 // default value
    }

//    constructor(name:String, age:Int) {
//        this.name = name
//        this.age = age
//        this.grade = 1 // default value
//    }

    fun getName() = println("Your name is $name")
}

