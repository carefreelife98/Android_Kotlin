package k_arrays

class twoDimensionArr {
    fun arr2D() {
        val array1 = arrayOf(1, 2, 3)
        val array2 = arrayOf(4, 5, 6)
        val array3 = arrayOf(7, 8, 9)

        val arr2d = arrayOf(array1, array2, array3)

        for (e1 in arr2d) {
            for (e2 in e1) {
                print("$e2")
            }
            println()
        }

        println(arr2d[0][1])
        println(arr2d[1][1])
        println(arr2d[2][1])
    }
}