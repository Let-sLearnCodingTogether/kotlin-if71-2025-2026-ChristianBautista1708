fun main() {
    val idProduct : Long = 9876543210L
    val hargaProduk : Float = 3499990.50F
    val beratProdukKg : Float = 0.15F
    val jumlahStok : UByte = 250u
    val jumlahTerjual : Short = 1843
    val kodeKategori : Byte = 12
    val tahunRilis : UShort = 2025u

    println("idProduk : " + idProduct)
    println("hargaProduk : %.2f".format(hargaProduk))
    println("beratProdukKg : " + beratProdukKg)
    println("jumlahStok : " + jumlahStok)
    println("jumlahTerjual : " + jumlahTerjual)
    println("kodeKategori : " + kodeKategori)
    println("tahunRilis : " + tahunRilis)

}