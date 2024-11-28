package src

class Assistant {
    var name = ""

    fun bringCoffee(count: Int, nameOfCoffee: String) {
        repeat(count) {
            println("Подойти к кофе машине")
            println("Налить кофе \"$nameOfCoffee\"")
            println("Принести кофе \"$nameOfCoffee\"")
            println("Уйти на рабочее место")
        }
    }
}