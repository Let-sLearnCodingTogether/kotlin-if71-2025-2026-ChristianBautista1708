fun prosesArrayGeneric() {
    val jumlahData = 1_000_000

    val dataSensor = Array(jumlahData) {
        it + 1
    }

    val waktuMulai = System.nanoTime()

    var total : Long = 0
    for (data in dataSensor) {
        total += data
    }

    val ratata = total.toDouble()
    val waktuSelesai = System.nanoTime()
    val durasiMs = (waktuSelesai - waktuMulai) /1000_000.0

    println("Jumlah data : $jumlahData")
    println("Waktu : $durasiMs")
}

fun processArrayPrimitive() {
    val jumlahData = 1_000_000

    val dataSensor = IntArray(jumlahData) {
        it + 1
    }

    val waktuMulai = System.nanoTime()

    var total : Long = 0
    for (data in dataSensor) {
        total += data
    }

    val ratata = total.toDouble()
    val waktuSelesai = System.nanoTime()
    val durasiMs = (waktuSelesai - waktuMulai) /1000_000.0

    println("Jumlah data : $jumlahData")
    println("Waktu : $durasiMs")
}

fun main() {
    prosesArrayGeneric()
    processArrayPrimitive()
}