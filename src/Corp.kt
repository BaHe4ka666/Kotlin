import src.Assistant
import src.Consultant
import src.ProductCard

fun main() {
    val assistant = Assistant()
    assistant.bringCoffee(count = 4)

    val consultant = Consultant("Alex", 23)
    consultant.sayHello()
}
