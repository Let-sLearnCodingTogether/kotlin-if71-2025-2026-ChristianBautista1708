package Exception

fun validasiUmur2(umur : Int) : Int {
    if(umur < 0) {
        throw IllegalArgumentException("Umur Tidak Boleh Negatif")
    }
    return umur / 0
}

fun main() {
    println("Start")
    try {
        validasiUmur2(10)
        validasiUmur2(-1)
    } catch (error : IllegalArgumentException) {
        println("Error dengan message ${error.message}")
    } catch (error : ArithmeticException) {
        println("Error pembagian dengan 0")
    } catch (error : Exception) {
        println("Error tidak diketahui ${error.message}")
    }
    println("Finish")
}