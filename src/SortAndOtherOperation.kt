fun main() {
    val ages: Array<Int> = arrayOf(25, 30, 40, 50, 60)

    println("Age : ${ages.joinToString()}")

//    ages.sort()
    ages.sorted()
    println("Age sort : ${ages.joinToString()}")

    ages.reverse()
    println("Ages reverse : ${ages.joinToString()}")

    println("Slice : ${ages.slice(2..4).joinToString()}")
}