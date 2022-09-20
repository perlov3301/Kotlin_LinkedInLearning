fun types2 () {
    println("types2 signature;")
    var greetingFunction1: (String) -> String = {
        "  Hello $it"
    }
    var greetingFunction2: (String) -> String = { thingToGreet ->
        "  Hello $thingToGreet"
    }
    var a = greetingFunction1("World")
    println(a)
    a = greetingFunction1("Kotlin")
    println(a)
    greetingFunction1 = {
        "  reassigned1: Hello there" } // there is no place for variable
    a = greetingFunction1.invoke("World") // the parameter is not used
    println(a)
    greetingFunction1 = { thingToGreet ->
        "  reassigned2: Hello $thingToGreet!"
    }
    a = greetingFunction1.invoke("Kotlin Programming")
    println(a)
}