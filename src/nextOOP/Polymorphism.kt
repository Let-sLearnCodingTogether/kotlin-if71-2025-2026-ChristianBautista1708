package nextOOP

open class Kendaraan() {
    open fun klakson() {
        println("Suara klakson")
    }
}

class Mobil() : Kendaraan() {}

class Motor() : Kendaraan() {
    override fun klakson() {
        println("Klakson Motor")
    }
}

fun main() {
    Mobil().klakson()
    Motor().klakson()
}