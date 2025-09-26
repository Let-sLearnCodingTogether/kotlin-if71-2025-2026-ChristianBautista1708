fun String.greeting() : String {
    return "Welcome, $this"
}

fun Int.isEven() : Boolean {
    return this % 2 == 0
}

fun main() {
    val username = "Christian"
    val age : Int = 20
    println(username.greeting())
    println(age.isEven())
}