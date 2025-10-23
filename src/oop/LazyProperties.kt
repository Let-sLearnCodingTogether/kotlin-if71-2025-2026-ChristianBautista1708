package oop

class TranskripNilai {
    val list : List<String> by lazy {
        println("List di akses")
        listOf("A", "B", "C")
    }
}

fun main() {
    val nilaiMhs = TranskripNilai()
    println(nilaiMhs.list)
    println(nilaiMhs.list)
    println(nilaiMhs.list)
    println(nilaiMhs.list)
}