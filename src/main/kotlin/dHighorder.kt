
fun highOrder1 () {
    println("high Order function")
    fun printCalculatedValue1(value1: Int,value2: Int, text: String, calculator: (Int,Int) -> Int) {
        println("  The value of $text is: ${calculator(value1, value2)}")
    }
    printCalculatedValue1(2, 2, " 2 + 2", { value1, value2 ->
        value1 + value2
    })
    printCalculatedValue1(2, 2, "2 - 2", { value1, value2 ->
        value1 - value2
    })
    // passing Lambda outside the parameters: Trailing Lambda syntax
    printCalculatedValue1(2, 2, "2 + 2*2") { value1, value2 ->
        value1 + 2*value2
    }
}