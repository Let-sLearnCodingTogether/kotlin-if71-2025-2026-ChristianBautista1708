package nextOOP

open class Pegawai(val nama : String, val gajiDasar : Double) {
    fun hitungGaji () {
        println("$nama mendapatkan gaji sebesar $gajiDasar")
    }
}

class Manager (nama : String, gajiDasar: Double) : Pegawai(nama, gajiDasar) {

}

class Programmer (nama : String, gajiDasar: Double) : Pegawai(nama, gajiDasar) {

}

fun main() {
    val manager = Manager("ahu", 2000000.0)
    manager.hitungGaji()
    val programmer = Programmer("tian", 8000000.0)
    programmer.hitungGaji()

    val listPegawai : List<Pegawai> = listOf(
        Manager("ahu", 2000000.0),
        Programmer("tian", 8000000.0)
    )

    listPegawai.forEach { pegawai -> pegawai.hitungGaji() }
}