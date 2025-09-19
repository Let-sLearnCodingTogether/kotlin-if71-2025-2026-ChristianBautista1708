fun main() {
    val finalExam = 'A'
    var nilai = 0
    var kuis = 'A'
    var status = false
    val nilaiLulus = arrayOf('A', 'B')

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak Lulus")
    }

    when(finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> {
            println("Tidak Lulus")
        }
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when(finalExam) {
        'A', 'B' -> status = true
        else -> status = false
    }

    println(status)

    val status1 = when(finalExam) {
        'A', 'B' -> true
        else -> false
    }
    println(status)

    when (kuis){
        'A' -> nilai = 80
        'B' -> nilai = 60
        'C' -> nilai = 40
        else -> nilai = 20
    }

    println("Nilai : " + nilai)

    when(finalExam) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak Lulus")
    }

    when(finalExam) {
        is Char -> println("ya, ini char")
        is String -> println("Ini String")
        !is Char -> println("bukan char")
    }
}