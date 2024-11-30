package src.corporation

class Assistant(
    name: String,
    age: Int = 0
) : Worker(name = name, age = age) {
    fun bringCoffee(count: Int = 1, nameOfCoffee: String = "Латте"): String {
        repeat(count) {
            println("Подойти к кофе машине")
            println("Налить кофе \"$nameOfCoffee\"")
            println("Принести кофе \"$nameOfCoffee\"")
            println("Уйти на рабочее место")
        }
        return nameOfCoffee
    }

    override fun work() {
        println("I make coffee")
    }
}