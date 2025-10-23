package oop

class PersegiPanjang (val panjang : Double, val lebar : Double) {
    val luas : Double
        get() = panjang * lebar
}

fun main() {
    val persegiPanjang1 = PersegiPanjang(10.0, 20.0)
    println(persegiPanjang1.luas)
}