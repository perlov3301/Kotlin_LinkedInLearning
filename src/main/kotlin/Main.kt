fun main() {
 aPrintNulable()
 types1()
 types2()
 highOrder1()
 println("assignment")
 nameFormatter("Alex ", "Perlov") {
  firstName, lastName -> firstName.plus(lastName)
 }
 nameFormatter("Shlomo-Alexander", "Perlov") {
  firstName, lastName -> firstName + " " + lastName
 }
 println(basicFormatter("Shlomo-Alexander", "Perlov"))

 println("main;")


}