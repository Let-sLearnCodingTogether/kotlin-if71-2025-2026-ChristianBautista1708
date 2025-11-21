package Exception

fun validasiUmur(umur : Int) {
    if(umur < 0) {
        throw IllegalArgumentException("Umur Tidak Boleh Negatif")
    }
    println("Umur valid ${umur}")
}

fun main() {
    println("Start")
    validasiUmur(10)
    validasiUmur(-1)
    println("Finish")
}