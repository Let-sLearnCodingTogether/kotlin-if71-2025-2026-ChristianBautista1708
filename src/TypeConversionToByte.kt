fun main() {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()

    println(myShort)

    val myInt2 : Int = 40000
    val myShort2 : Short = myInt2.toShort()

    println(myShort2)
    println(Integer.toBinaryString(myInt2).padStart(length = 64, padChar = '0'))
    //1001110001000000
    //0110001110111111 -> 25535
    //25535 + 1 = 25536
    //-25536
}