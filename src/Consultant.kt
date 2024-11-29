package src

class Consultant(
    val name: String,
    val age: Int = 0
) {
    fun sayHello() {
        if (age != 0) {
            println("Привет, меня зовут $name. Мне $age лет.")
        } else {
            println("Привет, меня зовут $name.")
        }
    }
}