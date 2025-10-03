fun main() {
    // Immutable
    val fruits : Map<String, Int> = mapOf(
        "jeruk" to 10,
        "apel" to 3
    )
    println(fruits["jeruk"])

    // Mutable
    val buah : MutableMap<String, Int> = mutableMapOf(
        "jeruk" to 10,
        "apel" to 3
    )

    println(buah["apel"])
}