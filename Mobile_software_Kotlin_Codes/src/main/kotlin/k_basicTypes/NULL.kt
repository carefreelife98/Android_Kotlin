package k_basicTypes

class NULL {
    fun NULL() {

        // 변수의 type 직후에 ? (= nullable type) 를 붙혀 nullable 변수로 만들 수 있다.
        var myFavoriteSinger: String? = null
        println(myFavoriteSinger)

        myFavoriteSinger = "Westlife"
        println(myFavoriteSinger)
    }

    fun NULL2() {
        var myFavoriteSinger: String? = null

        // 에러. nullable type 변수는 메소드 적용 시에도 nullable 하게 작성 해주어야 한다.
//        myFavoriteSinger.length
        myFavoriteSinger = "Westlife"
        println(myFavoriteSinger.length)
    }

    fun nullCheck(s: String?) {
        if (s == null) {
            println("\"$s\" is null")
        }
        else println("\"$s\" is NOT null")
    }

    fun emptyCheck(s: String?) {
        if (s?.isEmpty() == true) {
            println("\"$s\" is empty")
        }
        else println("\"$s\" is NOT empty")
    }

    fun assertionOperator() {
        var mfs: String? = "BTS"
        println(mfs!!.length)
    }

    fun ifAsEquation() {
        var equation: String? = "CarefreeLife"

        var length = if (equation != null) {
            equation.length
        } else {
            0
        }
        println("length is $length")
    }

    fun ifAsEquation2() {
        var equation: String? = "CarefreeLife"
        var length = equation?.length ?: 0
        println("length is $length")
    }

    // Smart Cast
    fun typeCheck(x: Any) {
        if (x is Int)
            println("$x is INT")
        else
            println("$x is NOT INT")
    }

    fun typeCheck2(x: Any) {
        if (x is Int) {
            println("$x is ${x.javaClass}")
        }
        else if (x !is Int) {
            println("$x is NOT Int. The type is ${x.javaClass}")
        }

        var num: Long = 8L
        val str: Any

        typeCheck2(num)
        typeCheck2(8)
        var ld = num as Long
        typeCheck2(ld)

        str = "Hello, Kotlin"
        if (str is String) {
            println("\"$str\" is ${str.javaClass}")
        }
    }


}