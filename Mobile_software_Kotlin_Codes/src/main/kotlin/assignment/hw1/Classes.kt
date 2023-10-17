package assignment.hw1

class Classes {

    fun p4() {
        class SmartDevice {
            // Class's Property (클래스의 속성)
            val name = "Android TV"
            val category = "Entertainment"
            var status = "online" // 변경 가능 변수

            // Class's Methods
            fun turnOn() {
                println("Smart device is turned on.")
            }
            fun turnOff() { // member function == method
                println("Smart device is turned off.")
            }
        }

        // constructor, class instance = object
        val smartTV: SmartDevice = SmartDevice()

        // 클래스의 메소드 호출
        smartTV.turnOn()
        smartTV.turnOff()

        // 클래스의 속성 호출
        println("Device name is = ${smartTV.name}")
    }

    fun p6() {
        class Person {
            // 3개 Properties 속성 초기화
            var name: String = "Chae"
            var age: Int = 26
            var isMarried: Boolean = false

            fun getName() = println("The name is $name.")
        }

        val chae = Person()
        chae.getName()
        println("${chae.age}, ${chae.isMarried}")
    }

    fun p7() {
        class Person {
            // 3개 Properties 속성 선언. (초기화 x)
            var name: String
            var age: Int
            var isMarried: Boolean

            // secondary constructor.
            // Secondary constructor 에 전달되는 Parameter 이름과 class 속성 이름을 다르게 지정하면
            // 둘 사이의 구분이 되므로 this. 을 생략할 수 있게 된다. (this 는 현재 객체를 나타냄)
            constructor(_name: String, _age: Int, _isMarried: Boolean) {
//        this.name = _name
//        this.age = _age
//        this.isMarried = _isMarried
                name = _name
                age = _age
                isMarried = _isMarried
            }

            // secondary constructor 는  인자 값을 다르게 주어 여러 개 생성 가능.
            constructor(_name: String, _age: Int) {
                name = _name
                age = _age
                isMarried = true // 속성에 default 값으로 true를 할당. (Parameter 에서 제거)
            }

            fun getName() = println("The name is $name.")
        }

        // 첫번째 Constructor 사용 (Parameter 3개)
        val chae = Person("Chae", 26, false)

        // 두번째 Constructor 사용 (Parameter 2개)
        val kim = Person("Kim", 27)

        chae.getName()
        println("${chae.age}, ${chae.isMarried}")
    }

    fun p8() {
        class Person {
            // 3개 Properties 속성 선언. (초기화 x)
            var name: String
            var age: Int
            var isMarried: Boolean

            // secondary constructor.
            // Secondary constructor 에 전달되는 Parameter 이름과 class 속성 이름을 다르게 지정하면
            // 둘 사이의 구분이 되므로 this. 을 생략할 수 있게 된다. (this 는 현재 객체를 나타냄)
            constructor(_name: String, _age: Int, _isMarried: Boolean) {
//        this.name = _name
//        this.age = _age
//        this.isMarried = _isMarried
                name = _name
                age = _age
                isMarried = _isMarried
            }

            fun getName() = println("The name is $name.")
        }

        // 첫번째 Constructor 사용 (Parameter 3개)
        val chae = Person("Chae", 26, false)
        chae.getName()
        println("${chae.age}, ${chae.isMarried}")
    }

    fun p9() {
        class Person {
            // 3개 Properties 속성 선언. (초기화 x)
            var name: String
            var age: Int
            var isMarried: Boolean

            // secondary constructor.
            // Secondary constructor 에 전달되는 Parameter 이름과 class 속성 이름을 다르게 지정하면
            // 둘 사이의 구분이 되므로 this. 을 생략할 수 있게 된다. (this 는 현재 객체를 나타냄)
            constructor(_name: String, _age: Int, _isMarried: Boolean) {
//        this.name = _name
//        this.age = _age
//        this.isMarried = _isMarried
                name = _name
                age = _age
                isMarried = _isMarried
            }

            // secondary constructor 는  인자 값을 다르게 주어 여러 개 생성 가능.
            constructor(_name: String, _age: Int) {
                name = _name
                age = _age
                isMarried = true // 속성에 default 값으로 true를 할당. (Parameter 에서 제거)
            }

            fun getName() = println("The name is $name.")
        }

        // 첫번째 Constructor 사용 (Parameter 3개)
        val chae = Person("Chae", 26, false)

        // 두번째 Constructor 사용 (Parameter 2개)
        val kim = Person("Kim", 27)

        chae.getName()
        println("${chae.age}, ${chae.isMarried}")
    }

    fun p10() {
        // Primary constructor - class 생성 시에 class 속성을 함께 선언
        class Person(var name: String,
                     var age: Int,
                     var isMarried: Boolean) {
            // method 는 Class body 내부에 작성해야 함.
            fun getName() = println("The name is $name.")
        }

        val chae = Person("Hora", 36, false)
        chae.getName()
        println("${chae.age}")
        if (chae.isMarried) {
            println("${chae.name} is already married.")
        }
        else
            println("${chae.name} is not married yet.")
    }

    fun p11() {
        class Person(
            var name: String,
            var age: Int,
            var isMarried: Boolean,
        ) {
            // init block 을 사용.
            // constructor 실행 시 제일 먼저 실행됨.
            init {
                println("Beginning of init block")
                println("이름=$name, 나이=$age")
                println("End of init block")
            }

            // method 는 Class body 내부에 작성해야 함.
            fun getName() = println("The name is $name.")
        }
        val chae = Person("Hora", 23, false)
        println("The name is ${chae.name}")
        chae.getName()
    }

    fun p13() {
        // Primary constructor
        class Person(var name: String,
                     var age: Int,
                     var isMarried: Boolean) {
            // 주 생성자에서 초기화 되지 않은 속성. 빈 문자열로 초기화.
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
                this.nickName = _nickName  // 추가 속성 초기화
            }
        }

        // 첫번째 Constructor 사용 (Parameter 3개)
        val chae = Person("Chae", 26, false, "CarefreeLife")
        println("${chae.name}, ${chae.age}, ${chae.isMarried}, ${chae.nickName}")
    }

    fun p14() {
        class Rectangle(val shape: String,
                        var height: Int,
                        var width: Int)

        val rect = Rectangle("Rectangle", 30, 30)
        rect.height = 40 // getter 호출한 것
        rect.width = 40 // setter 호출한 것
        println("${rect.shape}, ${rect.width}, ${rect.height}") // getter
    }

    fun p15() {
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
    }

    fun p16() {
        class PersonScopeFunc (var name:String,
                               var age:Int,
                               var isMarried:Boolean)

        val chae: PersonScopeFunc = PersonScopeFunc("Chae", 26, false)

        // 객체에 scope 함수를 사용하게 되면 해당 중괄호 내부는 객체 참조를 하고 있는 상태가 된다.
        // 따라서 this. 와 같은 메소드를 사용하지 않아도 해당 객체를 참조할 수 있게 된다.
        chae.apply {
            // this.name, this.age 대신 직접 class 의 property 를 사용하는 모습.
            println("$name $age $isMarried")
        }

        with(chae) {
            // this.name, this.age 대신 직접 class 의 property 를 사용하는 모습.
            println("$name $age $isMarried")
        }
    }

    fun p21() {
        open class Animal {
            var color: String = ""
            fun eat() = println("Eat")
        }

        // super class Animal(부모 클래스) 로부터 상속받은 color, eat()
        class Dog: Animal() {
            //    var color: String = ""
            //    fun eat() = println("Eat")
            var bread: String = ""
            fun bark() = println("Bark")
        }
        // super class Animal(부모 클래스) 로부터 상속받은 color, eat()
        class Cat: Animal() {
            //    var color: String = ""
            //    fun eat() = println("Eat")
            var age: Int = -1
            fun meow() = println("Meow")
        }

        val dog = Dog()
        dog.apply {
            bread = "lebra"
            color = "Black"
            bark()
            eat()
            println("$bread, $color")
        }
    }

    fun p23() {
        open class Animal {
            // overriding 을 위해 Property 에 "open" 추가.
            open var color: String = ""

            // overriding 을 위해 Method 에도 "open" 추가.
            open fun eat() = println("Eat")
        }

        class Dog: Animal() {
            var bread: String = ""
            fun bark() = println("Bark")

            // Property overriding
            override var color: String = "White"

            // Method overriding
            override fun eat() {
                println("A doggy eats food.")
            }
        }

        val dog = Dog()

        println(dog.color)
        println(dog.eat())

        dog.apply {
            bread = "lebra"
            color = "Black"
            bark()
            eat()
            println("$bread, $color")
        }
    }

    fun p24() {
        // Super class 에 open -> overriding 가능
        // 주 생성자를 이용하여 초기화 : color
        // init block 실행
        open class Animal (var color: String) {
            init {
                println("at init block of the class Animal : $color")
            }
        }

        // 자식 클래스에서 부모 클래스 상속.  -> :Animal(color)
        // color 은 변수로서 부모 클래스에 전달되어 초기화됨.
        // breed 는 자식 클래스인 Dog 에서 초기화 됨.
        class Dog(color: String, var breed: String): Animal(color) {
            init {
                println("at init block of the class Dog : $color, $breed")
            }
        }

        fun main() {
            val dog = Dog("Black", "lebra")
            dog.apply {
                println("$color $breed")
            }
        }
    }

    fun p25() {
        open class Animal (open var color: String) {
            init {
                println("at init block of the class Animal : $color")
            }
        }

        class Dog(override var color: String, var breed: String): Animal(color) {
            init {
                println("at init block of the class Dog : $color, $breed")
            }
        }

        val animal = Animal("White")
        val dog = Dog("Black" ,"Pug")
        println("${animal.color} ")
        println("${dog.color}, ${dog.breed}")
    }

    fun p26() {
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

        var anim = Animal()
        println("Color = ${anim.color}")

        var dog = Dog("Black", "Pug")
        println("Color = ${dog.color}, breed = ${dog.breed}")
    }

    fun p27() {
        // Overriding : Method 나 Property 의 이름은 같지만 동작이나 값을 재정의.
        // Overloading : 동작은 같지만 Parameter 의 Type 이나 개수가 다름.
        class Calc {
            fun add(x:Int, y:Int):Int = x + y
            fun add(x:Float, y:Float):Float = x + y
            fun add(x:Float, y:Float, z:Float):Float = x + y + z
            fun add(x:Double, y:Double):Double = x + y
            fun add(x:String, y:String):String = x + y
        }

        val calc = Calc()
        println(calc.add(2, 3))
        println(calc.add(4.1f, 3.5f))
        println(calc.add(4.1f, 3.5f, 6.2f))
        println(calc.add(4.0, 5.0))
        println(calc.add("Carefree", "Life"))
    }

    fun p28() {
        class Foo {
            val a = 1
            protected val b = 2
            private val c = 3

            internal val d = 4
        }
    }

    fun p29() {
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

        val derived = Derived()
        // Private 으로 선언된 변수는 외부에서 직접 접근 불가.
        // derived.a = 2

        // Protected 로 선언된 함수가 존재하는 Class 를 상속 받은 하위 Class 에서 super Class 의 Protected 함수를 이용해 super Class 의 private 변수에 접근.
        derived.derivedFun()
    }

    fun p31() {
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

        // Anonymous 클래스 객체 생성
        val foo = Anonymous()

        // Anonymous Class
        foo.bar()
    }

    fun p33() {
        abstract class Foo {
            abstract fun bar()
        }

        // 무명 클래스 object 사용
        val foo = object : Foo() {
            // 추상 클래스의 추상 메소드를 구현
            override fun bar() {
                println("bar() is implemented")
            }
        }
        // Anonymous Class
        foo.bar()
    }

    fun p34() {
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

        // Anonymous 클래스 객체 생성
        val foo = Anonymous2()

        // Anonymous Class
        foo.bar2()
        foo.openFunction()
    }


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

    fun p37() {
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

        val button:Button = Button()
        button.setFocus(true)
        button.showOff()
        button.click()
    }
}