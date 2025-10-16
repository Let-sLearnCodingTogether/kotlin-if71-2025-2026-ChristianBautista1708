package oop

data class GameItem (val id : Int, var name : String, var value : Int, val rarity : String)

fun main() {
    val game: List<GameItem> = listOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic")
    )

    val cursedSword = game[0].copy()
    cursedSword.name = "Pedang Besi Terkutuk"
    cursedSword.value = 250

    println(game[0])
    println(cursedSword)
}
