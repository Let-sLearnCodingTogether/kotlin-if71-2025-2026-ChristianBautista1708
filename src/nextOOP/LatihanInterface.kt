package nextOOP

interface Electronic {
    val brand : String

    fun trunOn()
    fun trunOff()

    fun cleanDrive() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class SmartLight(override val brand: String) : Electronic {
    override fun trunOn() {
        println("Smart light merek $brand berputar")
    }

    override fun trunOff() {
        println("Smart light merek $brand berhenti")
    }
}

class Fan(override val brand: String) : Electronic {
    override fun trunOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun trunOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

fun main() {
    val fan1 = Fan("Miyako")

    fan1.trunOn()
    fan1.trunOff()

    val fan2 = Fan("Krisbow")

    fan2.trunOn()
    fan2.trunOff()

    val smartLight1 = SmartLight("APA")

    smartLight1.cleanDrive()
    smartLight1.trunOn()
    smartLight1.trunOff()
}