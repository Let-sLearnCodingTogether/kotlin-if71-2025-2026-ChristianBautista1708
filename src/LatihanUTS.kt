fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    var stokSedikit : Int = Int.MAX_VALUE
    var namaBarang = ""

    stokBarang.forEach { nama, stok ->
        if (stok < stokSedikit) {
            stokSedikit = stok
            namaBarang = nama
        }
    }
    println("Barang yang perlu segera di-restock adalah: $namaBarang")
}