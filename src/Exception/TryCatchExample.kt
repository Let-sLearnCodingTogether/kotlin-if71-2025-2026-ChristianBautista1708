package Exception

fun validasiUmur1(umur : Int) {
    if(umur < 0) {
        throw IllegalArgumentException("Umur Tidak Boleh Negatif")
    }
    println("Umur valid ${umur}")
}

fun main() {
    println("Start")
    try {
        validasiUmur1(10)
        validasiUmur1(-1)
    } catch (error : IllegalArgumentException) {
        println("Error dengan message ${error.message}")
    }
    println("Finish")
}