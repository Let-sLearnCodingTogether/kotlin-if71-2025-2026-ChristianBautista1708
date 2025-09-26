fun hitungPanjangNama (name : String?) : Int {
    return if(name != null) {
        name.length
    } else {
        0
    }
}
fun main() {
    println(hitungPanjangNama("christian"))
}