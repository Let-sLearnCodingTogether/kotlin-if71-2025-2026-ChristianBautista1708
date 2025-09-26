fun printUser(user: Array<String>) {
    for (name in user) {
        println(name)
    }
}
fun main() {
    printUser(user = arrayOf("User 1", "User 2", "User 3"))
}