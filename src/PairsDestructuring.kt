fun main() {
    val firstUser: Pair<String, Byte> = Pair("User 1", 20)

    //destructuring
    val (username, age) = firstUser

    println(username)
    println(age)
}