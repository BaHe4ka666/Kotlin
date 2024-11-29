import src.corporation.Assistant
import src.corporation.Consultant
import src.corporation.Director

fun main() {
    val director = Director("Vanya", 23)
    val assistant = Assistant("Helen", 32)
    val consultant = Consultant("Oleg")
    director.getCoffee(assistant)
    director.startWorkConsultant(consultant)
}
