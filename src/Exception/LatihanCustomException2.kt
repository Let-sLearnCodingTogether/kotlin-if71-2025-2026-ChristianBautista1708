package Exception

data class Barang (val nama : String, val stok: Int)

class StokHabisException(msg : String) : Exception(msg)

fun beliBarang(barang : Barang, jumlahBeli : Int) {
    if(jumlahBeli > barang.stok) {
        throw StokHabisException("Gagal beli ${barang.nama}. Stok hanya sisa ${barang.stok}")
    }

    println("Berhasil membeli $jumlahBeli ${barang.nama}")
}

fun main() {
    val barang1 = Barang("minyak", 10)
    try {
        beliBarang(barang1, 100)
    } catch (error : StokHabisException) {
        println("Terjadi error dengan pesan: ${error.message}")
    }
}
