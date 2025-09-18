fun main() {
    val firstUser: Triple<String, Byte, Char> = Triple("User 1", 20, 'M')

    //destructuring
    val (username, age, sex) = firstUser

    println(username)
    println(age)
    println(sex)
}