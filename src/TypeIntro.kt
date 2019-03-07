const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    var playerName = "Estragon"
    val pubName = "Unicorn's Horn"
    val publicanOnDuty = "Charles"
    var experiencePoints = 5
    var hasSteed = false
    var goldPieces = 50
    var pubDrinks: List<String> = listOf("mead", "wine", "LaCroix")
    playerName = playerName.reversed()
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
}