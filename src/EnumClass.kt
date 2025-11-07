enum class DayOfTheWeek {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach{
        println("${it.ordinal}. ${it.name}")
    }

    println(DayOfTheWeek.valueOf("Senin"))
    // println(DayOfTheWeek.valueOf("senin")) //return nya Exception

    val today = DayOfTheWeek.valueOf("Senin")

    when(today) {
        DayOfTheWeek.Senin -> println("Yah, senin lagi")
        DayOfTheWeek.Selasa -> println("hari selasa")
        DayOfTheWeek.Minggu -> println("Hari Libur")
        else -> println("Hari lain")
    }
}