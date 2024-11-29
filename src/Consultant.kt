package src

import kotlin.random.Random

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

    fun serveClient(): Int {
        val random = Random.nextInt(0, 100)
        repeat(random) {
            println("The client is served.")
        }
        return random
    }
}