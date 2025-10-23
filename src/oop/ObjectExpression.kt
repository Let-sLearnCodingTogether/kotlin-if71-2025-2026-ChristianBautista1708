package oop

fun main() {
    val person = object {
        val name = "Christian Bautista"
        fun greet() : String {
            return "Hello $name"
        }
    }

    println(person.greet())
}