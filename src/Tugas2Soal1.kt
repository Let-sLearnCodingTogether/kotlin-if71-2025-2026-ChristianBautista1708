fun hitungIpk (nilai : List<Double?>) : Double{
    var totalNilai : Double = 0.0
    var jumlahMataKuliah = 0
    for (total in nilai) {
        if (total != null) {
            totalNilai += total
            jumlahMataKuliah++
        }
    }
    return if (jumlahMataKuliah > 0) {
        totalNilai / jumlahMataKuliah
    } else{
        0.0
    }
}

fun main() {
    val nilaiSemester1 = listOf(3.5, 4.0, null, 2.5, 3.0, null)
    val ipk1 = hitungIpk(nilaiSemester1)
    println("IPK Semester 1 : $ipk1")

    val nilaiSemester2 = listOf(null, null, null)
    val ipk2 = hitungIpk(nilaiSemester2)
    println("IPK Semester 2 : $ipk2")
}