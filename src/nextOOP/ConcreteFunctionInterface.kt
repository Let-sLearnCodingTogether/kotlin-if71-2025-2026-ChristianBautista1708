package nextOOP

interface SpaceVehicle {
    fun accelerate()

    fun stop() {
        println("stop")
    }
}

class LightSpace : SpaceVehicle {
    override fun accelerate() {
        println("Accelerate")
    }
//    Kalau dioverride tetap bisa
//    override fun stop() {
//        println("Stop overide")
//    }
}

fun main() {
    val lightSpace1 = LightSpace()

    lightSpace1.accelerate()
    lightSpace1.stop()
}