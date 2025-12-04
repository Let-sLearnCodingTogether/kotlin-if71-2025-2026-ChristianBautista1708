package Coroutine

import java.util.concurrent.Executors

fun main() {
//    val executor = Executors.newFixedThreadPool(3)
//    val executor = Executors.newCachedThreadPool()
    val executor = Executors.newSingleThreadExecutor()

    for (i in 1..10) {
        executor.submit {
            val threadName = Thread.currentThread().name

            println("Tugas $i berjalan di thread $threadName")

            Thread.sleep(1_000)
        }
    }
}