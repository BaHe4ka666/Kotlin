package src

class Assistant(
    val name: String
) {
    fun bringCoffee(count: Int = 1, nameOfCoffee: String = "Латте"): String {
        repeat(count) {
            println("Подойти к кофе машине")
            println("Налить кофе \"$nameOfCoffee\"")
            println("Принести кофе \"$nameOfCoffee\"")
            println("Уйти на рабочее место")
        }
        return nameOfCoffee
    }

}