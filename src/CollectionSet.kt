fun main() {
    // Immutable
    val animals : Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    // Mutable
    val fruits : MutableSet<String> = mutableSetOf("Apple", "Jeruk")
    println(fruits)
}