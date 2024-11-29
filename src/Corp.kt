import src.Assistant
import src.Consultant
import src.Director

fun main() {
    val director = Director("Vanya", 23)
    val assistant = Assistant("Helen")
    val consultant = Consultant("Oleg")
    director.getCoffee(assistant)
    director.startWorkConsultant(consultant)
}
