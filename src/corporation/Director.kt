package src.corporation

class Director(
    name: String, //передача параметров в конструктор
    age: Int
) : Worker(name = name, age = age) {

    fun getCoffee(assistant: Assistant) {
        val drinkName = assistant.bringCoffee()
        println("Thank you ${assistant.name}! The $drinkName is grate!")
    }

    fun startWorkConsultant(consultant: Consultant) {
        val count = consultant.serveClient()
        println("Consultant ${consultant.name} served $count clients.")
    }
}