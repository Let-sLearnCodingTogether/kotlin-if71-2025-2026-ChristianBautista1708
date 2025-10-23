fun main() {
    val daftarMahasiswa = listOf(
        Pair("Budi", 3.8),
        Pair("Ani", 3.5),
        Pair("Doni", 3.7)
    )

    val mahasiswaCumlaude = daftarMahasiswa
        .filter {it.second > 3.5}
        .map {it.first}

    println(mahasiswaCumlaude)
}