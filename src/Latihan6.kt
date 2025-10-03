import kotlin.collections.component1
import kotlin.collections.component2

fun main() {
    val daftarJudulBuku : List<String> = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"
    )
    val koleksiGenre : MutableSet<String> = mutableSetOf(
        "Novel",
        "Filsafat",
        "Sejarah"
    )
    val inventarisBuku : MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras",
        "978-602-03-8591-6" to "Laskar Pelangi"
    )

    println("--- 1. Inisialisasi Data ---")
    println(daftarJudulBuku)
    println(koleksiGenre)
    println(inventarisBuku)
    println("----------------------------")
    println()
    println("--- 2. Manipulasi dan Analisis Data ---")
    println("Judul buku dengan dengan ISBN 978-979-3062-79-2 adalah : ${inventarisBuku.get("978-979-3062-79-2")}")
    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku baru '${inventarisBuku.get("978-623-91289-8-2")}' berhasil ditambahkan")
    println("Isi inventaris sekarang : {$inventarisBuku}")
    println("Jumlah genre unik yang ada di toko : ${koleksiGenre.size}")
    println()
    println("Daftar semua judul buku yang tercatat:")
    daftarJudulBuku.forEach { daftarBuku ->
        println("- " + daftarBuku)
    }
    println("----------------------------")
}