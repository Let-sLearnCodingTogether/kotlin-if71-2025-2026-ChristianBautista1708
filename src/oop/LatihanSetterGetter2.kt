package oop

class MahasiswaMDP (ipk : Double) {
    var ipk : Double = ipk
        get() = field
        set(value) {
            if (value < 0.0) {
                field = 0.0
            } else if (value > 4.0) {
                field = 4.0
            } else {
                field = value
            }
        }
}

fun main() {
    val mahasiswa1 = MahasiswaMDP(3.8)
    println(mahasiswa1.ipk)

    mahasiswa1.ipk = 4.5
    println(mahasiswa1.ipk)

    mahasiswa1.ipk = -1.0
    println(mahasiswa1.ipk)
}