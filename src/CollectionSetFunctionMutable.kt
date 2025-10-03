fun main() {
    // Mutable
    val animals : MutableSet<String> = mutableSetOf()
    animals.add("Kucing")
    animals.add("Zebra")
    println(animals)

    animals.remove("Kucing")
    println(animals)

    animals.addAll(listOf("Anjing", "Kuda", "Harimau"))
    println(animals)

    animals.removeAll(listOf("Kuda", "Harimau"))
    println(animals)

    animals.retainAll(listOf("Zebra"))
    println(animals)

    animals.clear()
    println(animals)
}