package oop

class MahasiswaThisKeyword(val nama : String) {
    fun sayGoodbye (nama : String) {
        println("$nama : ${this.nama}")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyword(
        "Mahasiswa Pertama"
    )
    mahasiswaPertama.sayGoodbye("Mahasiswa 1")
}