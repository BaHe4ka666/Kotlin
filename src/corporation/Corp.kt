import src.corporation.Assistant
import src.corporation.Consultant
import src.corporation.Director
import src.corporation.Worker

fun main() {
    val director: Worker = Director("Vanya", 23)
    val assistant: Worker = Assistant("Helen", 32)
    val consultant: Worker = Consultant("Oleg") // UPCAST
    (assistant as Assistant).bringCoffee() // DOWNCAST
    (director as Director).startWorkConsultant(consultant as Consultant)
    director.getCoffee(assistant) // SMARTCAST
}
