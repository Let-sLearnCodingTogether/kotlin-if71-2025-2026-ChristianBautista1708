class Karyawan (val nama : String, val id : String, val gajiPokok : Double) {
    fun tampilkanProfil() : Unit {
        println("$nama, $id")
    }

    fun hitungGajiBulanan(jumlahHariMasuk : Int) : Double {
        return (jumlahHariMasuk.toDouble() / 22) * gajiPokok
    }
}

fun main() {
    val karyawanA = Karyawan("Jono", "K001", 2_000_000.0)
    val karyawanB = Karyawan("Tomy", "K002", 2_500_000.0)

    karyawanA.tampilkanProfil()
    karyawanB.tampilkanProfil()

    println("Gaji Bulanan Karyawan A : %.2f".format(karyawanA.hitungGajiBulanan(20)))
    println("Gaji Bulanan Karyawan B : %.2f".format(karyawanB.hitungGajiBulanan(22)))

}