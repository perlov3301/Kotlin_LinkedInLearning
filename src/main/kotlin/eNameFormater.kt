fun nameFormatter (firstName: String, lastName: String,
                  formatter: (String,String) -> String) {
    println("  the formatted Name is '${formatter(firstName, lastName)}'")
}
val basicFormatter: (String, String) -> String = {
    firstName, lastName -> "  first Name is $firstName last Name is $lastName"
}