package k_Class

class PersonScopeFunc (var name:String,
                       var age:Int,
                       var isMarried:Boolean)


fun main() {
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