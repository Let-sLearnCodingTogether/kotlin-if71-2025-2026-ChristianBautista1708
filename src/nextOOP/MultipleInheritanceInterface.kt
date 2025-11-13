package nextOOP

interface Wheeled {
    val numberOfWheels: Int
}

interface Vehicle1 {
    fun drive()
}

class SepedaRodaTiga(override val numberOfWheels: Int = 3) : Wheeled, Vehicle1 {
    override fun drive() {
        print("Sepeda bergerak")
    }
}

fun main() {
    val sepedaRodaTiga1 = SepedaRodaTiga(3)
    sepedaRodaTiga1.drive()
}