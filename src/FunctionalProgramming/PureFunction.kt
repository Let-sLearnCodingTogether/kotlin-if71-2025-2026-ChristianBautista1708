package FunctionalProgramming

// Contoh yang pure function
fun add(a : Int, b : Int) : Int = a + b

// Contoh impure function
var count = 0 // anggap saja ini global variable
fun addImpureFunction(a : Int) : Int {
    count += 1
    return a + count
}

fun main() {
    add(1, 2) // 3
    add(1, 2) // 3
    add(1, 2) // 3

    println(addImpureFunction(1)) // 2
    println(addImpureFunction(1)) // 3
}