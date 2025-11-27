package FunctionalProgramming

fun operateOnNumbers(a : Int, b : Int, operation : (Int, Int) -> Unit) {
    return operation(a, b)
}


fun main() {
    operateOnNumbers(1, 3) { x, y -> println(x + y)}
    operateOnNumbers(1, 3) { x, y -> println(x * y)}
    operateOnNumbers(1, 3) { x, y -> println(x - y)}
}