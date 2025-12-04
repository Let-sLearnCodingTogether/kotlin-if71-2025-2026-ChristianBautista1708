package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking() {
    println("Aplikasi dimulai")

    login()

    println("Pindah halaman dari login, ke home")
}

suspend fun login() {
    println("Melakukan validasi email dan password")
    delay(2000)
    println("Validasi Sukses")
}