package oop

// Immutable dan Mutable
class MahasiswaConstructor(
    val npm : String,
    val nama : String,
    var ipk : Float
)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2226250002",
        nama = "Christian Bautista",
        ipk = 1.3f
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)
}