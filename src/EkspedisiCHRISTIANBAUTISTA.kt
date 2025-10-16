fun main() {
    val NAMA_PETUALANG = "Christian Bautista"
    var KAPASITAS_TAS = 20.0
    var totalBeratBawaaan = 0.0
    var jumlahBarang = 1

    println("Kalkulator Logistik untuk Ekspedisi " + NAMA_PETUALANG + " dimulai...")
    println()

    while (true) {
        if (jumlahBarang <= 3) {
            println("--- Memasukkan Barang #" + jumlahBarang + " ---")
            print("Masukkan nama barang : ")
            var namaBarang = readln()

            print("Masukkan berat untuk '" + namaBarang + "' (kg): ")
            var beratBarang = readln().toDoubleOrNull()?:0.0

            totalBeratBawaaan = totalBeratBawaaan + beratBarang

            println("'" + namaBarang + "' dengan berat " + beratBarang + " kg telah ditambahkan.")

            var sisaKapasitas = KAPASITAS_TAS - totalBeratBawaaan

            if (totalBeratBawaaan > KAPASITAS_TAS) {
                println()
                println("Bahaya, Kelebihan Muatan! Berat saat ini: " + totalBeratBawaaan + " kg. Kapasitas Hanya " + KAPASITAS_TAS + " kg")
                break
            } else if (totalBeratBawaaan == KAPASITAS_TAS) {
                println()
                println("Optimal! Tas milik " + NAMA_PETUALANG + " sekarang penuh dengan sempurna.")
            } else if (jumlahBarang == 3) {
                println("Barang berhasil dimasukkan. Sisa kapasitas tas: " + sisaKapasitas + " kg.")
                println()
                break
            } else {
                println("Barang berhasil dimasukkan. Sisa kapasitas tas: " + sisaKapasitas + " kg." )
                println()
            }
            jumlahBarang++
        }


    }

}