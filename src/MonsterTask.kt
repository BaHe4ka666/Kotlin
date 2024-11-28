package src

fun main() {
    val info = readln().split(" ")
    val monster = Monster(
        pawsCount = info[0].toInt(),
        eyesCount = info[1].toInt(),
        fangsCount = info[2].toInt(),
        clawsCount = info[3].toInt(),
        tentaclesCount = info[4].toInt()
    )
    monster.printInfo()
}