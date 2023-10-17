package k_arrays

class Arrays {
    fun oneDimensionArr() {
        val intArray: Array<Int> = arrayOf(1, 2, 3)
        var intArray2: IntArray = intArrayOf(4, 5, 6, 7)

        println("${intArray.size}, ${intArray.first()}, ${intArray.last()}")
        println("${intArray2[0]}, ${intArray2.get(3)}")

        intArray2[2] = 8
        intArray2.set(3, 9)
        println("${intArray2.contentToString()}")

        // Lambda 를 활용한 식.
        val intArray3: Array<Int> = Array(3) {i -> intArray[i]}
    }

    fun showElement(arr : IntArray) {
        for (e in arr) {
            print("$e ")
        }
        println()
    }

    fun ForEach() {
        val intArray: Array<Int> = arrayOf(1, 2, 3)
        var intArray2: IntArray = intArrayOf(4, 5, 6, 7)

        intArray.forEachIndexed { i, e -> print("intArray[$i] = $e ") }
        intArray2.forEach { e -> print("$e ") }
        println()
    }


}