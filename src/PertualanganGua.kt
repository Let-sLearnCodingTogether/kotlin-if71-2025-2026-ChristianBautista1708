import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    var namaPemain : String
    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2

    print("Nama pemain : ")
    namaPemain = readln()

    var sedangBermain = true
    while (sedangBermain){
        println("$namaPemain, $kesehatanPemain, $jumlahPotion")
        println("Didepan kamu terdapat 2 buah jalur (1, 2) : ")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        var jalurInput = readln()
        val jalur = jalurInput.toIntOrNull()

        if (jalur == 1) {
            println("Kamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")
            print("Pilih Patung: ")
            var pilihPatung = readln().lowercase(getDefault())
            if (kesehatanPemain > 0) {
                when(pilihPatung) {
                    "naga" -> {
                        kesehatanPemain = kesehatanPemain - 35
                        println("Pintu terkunci dan membutuhkan kunci emas")
                        if (kesehatanPemain < 0) {
                            sedangBermain = false
                            println("Kesehatan Pemain Habis, Anda Kalah!")
                        } else {
                            sedangBermain = true
                        }

                    }
                    "griffin" -> {
                        punyaKunciEmas = true
                        println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
                        sedangBermain = false
                    }
                    "ular" -> {
                        kesehatanPemain = kesehatanPemain - 15
                        println("Pintu terkunci dan membutuhkan kunci emas")
                        if (kesehatanPemain < 0) {
                            sedangBermain = false
                            println("Kesehatan Pemain Habis, Anda Kalah!")
                        } else {
                            sedangBermain = true
                        }
                    }
                    else -> {
                        println("Mau menggunakan potion atau tidak")
                        var potion = readln().lowercase(getDefault())
                        if (potion == "y") {
                            jumlahPotion = jumlahPotion + 10
                        }

                        if (kesehatanPemain >= 100) {
                            kesehatanPemain = 100
                        }
                    }
                }
            } else {
                sedangBermain = false
                println("Kesehatan Pemain Habis, Anda Kalah!")
            }


        } else {
            kesehatanPemain = kesehatanPemain - 25
            println("Anda masuk perangkap")
            if (kesehatanPemain <= 0) {
                sedangBermain = false
                println("Kesehatan Pemain Habis, Anda Kalah!")
            }
        }
    }
}