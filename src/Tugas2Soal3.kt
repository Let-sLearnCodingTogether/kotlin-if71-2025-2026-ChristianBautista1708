class Produk (val nama : String, val harga : Int, val stok : Int, val diskon : Boolean)

fun main() {
    val daftarProduk = listOf(
        Produk("Laptop Gaming", 15000000, 10, true),
        Produk("Mouse Wireless", 250000, 4, false),
        Produk("Keyboard Mechanical", 800000, 15, true),
        Produk("Monitor 24 inch", 2000000, 2, true)
    )

    val produkDiskon = daftarProduk.filter { it.diskon }.map { it.nama }
    println("Produk Sedang Diskon: $produkDiskon")

    val stokMenipis = daftarProduk.filter { it.stok < 5 }.map { it.nama }
    println("Produk Stok Menipis: $stokMenipis")

    val namaProduk = daftarProduk.map { it.nama }
    println("Semua Nama Produk: $namaProduk")
}