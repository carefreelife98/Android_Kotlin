package k_basicTypes

class boolean {
    fun boolean(){
        var foo: Boolean = true
        val bar = false

        println(foo && bar)
        println(foo || bar)
        println(!foo)

        foo = !foo // toggle : Debug 시 Break Point
        println(foo)
    }
}