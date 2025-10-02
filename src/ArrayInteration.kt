fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2", "User 3")

    println("Size : ${users.size}")
    println("Indices : ${users.indices}")

    users[0] = "User 1 Update"

    users.forEach {
        println("users : $it")
    }

    users.forEach { user ->
        println("Foreach : $user")
    }

    users.forEachIndexed { index, user ->
        println("User ${index + 1} : $user")
    }
}