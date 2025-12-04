package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job : Job = launch {
        updateVersion()
    }

    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif ? ${job.isActive}")
    println("Apakah job ini dibatalkan ? ${job.isCancelled}")

    job.join()

    println("Aplikasi sedang digunakan")


    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif ? ${job.isActive}")
    println("Apakah job ini dibatalkan ? ${job.isCancelled}")
}

suspend fun updateVersion() {
    delay(5_000)
    println("Update selesai.")
}