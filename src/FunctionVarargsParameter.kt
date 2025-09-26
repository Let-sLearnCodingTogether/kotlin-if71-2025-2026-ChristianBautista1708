fun printUser1(firstName: String, vararg user: String) {
    println(firstName)
    for (name in user) {
        println(name)
    }
}
fun main() {
    printUser1("TEST","User 1", "User 2", "User 3")
}