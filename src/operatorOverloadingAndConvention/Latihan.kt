package operatorOverloadingAndConvention

data class Mana(var current: Int, var max: Int) {
    operator fun plus(other : Mana) : Mana {
        return Mana(current + other.current, maxOf(max, other.max))
    }

    operator fun inc() : Mana {
        val currentNew = current + 10
        return Mana(if (currentNew > max) current else currentNew, max)
    }

    operator fun minus(nilai : Int) : Mana {
        return Mana(current - nilai, max)
    }
}

fun main() {
    var mana1 = Mana(50, 100)
    val mana2 = Mana(20, 50)

    println(mana1 + mana2)
    mana1++
    println(mana1)
    println(mana1 - 30)
}