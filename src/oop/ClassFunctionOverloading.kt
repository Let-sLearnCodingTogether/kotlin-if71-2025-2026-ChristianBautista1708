package oop

class MahasiswaFuncitonOverloading(val nama : String) {
    fun sayHello() {
        println("Selamat malam $nama")
    }

    fun sayHello(word : String) {
        println("$word $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFuncitonOverloading("Mahasiswa")

    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat pagi")
}