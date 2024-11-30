import src.corporation.Accountant
import src.corporation.Assistant
import src.corporation.Consultant
import src.corporation.Director
import src.corporation.Worker
import src.productCard.ProductCard
import src.productCard.ShoesCard
import src.productCard.FoodCard
import src.productCard.HouseholdApplianceCard

fun main() {
    val director = Director("Vanya", 23)
    val assistant = Assistant("Helen", 32)
    val consultant = Consultant("Oleg")
    val accountant = Accountant("Mara", 23)
    val employees = listOf<Worker>(director, assistant, consultant, accountant) // UPCAST
    for (employee in employees) {
        employee.work()
    }
}
