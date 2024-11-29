package src

class Director(
    val name: String,
    val age: Int
) {
    fun getCoffee(assistant: Assistant) {
        val drinkName = assistant.bringCoffee()
        println("Thank you ${assistant.name}! The $drinkName is grate!")
    }

    fun startWorkConsultant(consultant: Consultant) {
        val count = consultant.serveClient()
        println("Consultant ${consultant.name} served $count clients.")
    }
}