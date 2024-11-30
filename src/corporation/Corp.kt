import src.corporation.Assistant
import src.corporation.Consultant
import src.corporation.Director
import src.corporation.Worker

fun main() {
    val director = Director("Vanya", 23)
    val assistant = Assistant("Helen", 32)
    val consultant = Consultant("Oleg")
    val employees = listOf<Worker>(director, assistant, consultant) // UPCAST
    for (employee in employees) {
        employee.work()
    }
}
