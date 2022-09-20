private fun getGreeting4() = "  Hello private Kotlin4"
fun types1 () {
    println("types1")
    fun getGreeting1(): String {  return "  Hello Kotlin1" }
    fun getGreeting2() = "  Hello Kotlin2"
    fun printGreeting() = print("  Hello World\n") // return unit
    fun getGreeting3(greeting: String = "  Hey", thingToGreet: String = "Every Body") =
        "$greeting $thingToGreet"

    println(getGreeting1())
    println(getGreeting3(thingToGreet = "World", greeting= "  Hey there"))
    println(getGreeting4())
}
