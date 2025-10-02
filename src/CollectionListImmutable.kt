fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur data"
    )

    println("List matakuliah wajib : $mataKuliahWajib")
    println("Size list matakuliah wajib : ${mataKuliahWajib.size}")

    println("Index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val matakuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $matakuliahUppercase")

    val matakuliahLebihDariKarakter = mataKuliahWajib.filter {
        it.length > 10
    }
    println("Matakuliah lebih dari 10 karakter : $matakuliahLebihDariKarakter")
}