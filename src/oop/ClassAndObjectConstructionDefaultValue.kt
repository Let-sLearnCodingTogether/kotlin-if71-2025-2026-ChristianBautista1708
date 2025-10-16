package oop

class MahasiswaConstructorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
) {
    init {
        println("Ini block init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        "2226250002",
        "Christian Bautista"
    )

    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        "2226250003",
        "Mahasiswa Dua",
        ipk = 4.0f
    )

    println(mahasiswaPertama.ipk)
    println(mahasiswaKedua.ipk)
}