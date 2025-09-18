fun main() {
    var totalBelanja : Double = 0.0
    println("Status Awal -> Total Belanja: Rp" + totalBelanja)

    var item1 : Double = 25000.0
    var item2 : Double = 15000.0
    var diskon : Double = 10000.0

    var totalItem1 : Double = (3 * item1)
    var totalItem2 : Double = (2 * item2)

    totalBelanja += totalItem1
    println("Setelah Item A -> Total Belanja: Rp" + totalBelanja)
    
    totalBelanja += totalItem2
    println("Setelah Item B -> Total Belanja: Rp" + totalBelanja)

    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja: Rp" + totalBelanja)

    var layanan : Double = totalBelanja / 100
    totalBelanja += layanan
    println("Ditambah Biaya Layanan (Rp" + layanan + ") -> Total Belanja: Rp" + totalBelanja)

    println("===================================")
    println("Total Akhir yang Harus Dibayar: Rp" + totalBelanja)
    println("===================================")






}