val inventaris : MutableMap<String, String> = mutableMapOf()

fun tambahBuku (ISBN : String, judulBuku : String) {
    if (inventaris[ISBN] == null) {
        inventaris[ISBN] = judulBuku
    }
}

fun cariBuku (ISBN : String) : String {
    return if (inventaris[ISBN] != null) {
        "Judul : ${inventaris.get(ISBN)}"
    } else {
        return "Buku tidak ditemukan."
    }
}

fun main() {
    tambahBuku("978-602-03-8591-0", "Bumi")
    tambahBuku("978-602-06-3841-8", "Bulan")
    tambahBuku("978-602-06-3841-8", "Matahari")

    println(cariBuku("978-602-03-8591-0"))
    println(cariBuku("978-979-3062-79-8"))

    val inventarisBuku = inventaris
    println("Daftar Buku : $inventarisBuku")
}