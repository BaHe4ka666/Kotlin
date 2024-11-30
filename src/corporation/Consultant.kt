package src.corporation

import kotlin.random.Random

class Consultant(
    name: String,
    age: Int = 0
) : Worker(name = name, age = age) {

    fun sayHello() {
        if (age != 0) {
            println("Привет, меня зовут $name. Мне $age лет.")
        } else {
            println("Привет, меня зовут $name.")
        }
    }

    fun serveClient(): Int {
        val random = Random.Default.nextInt(0, 100)
        repeat(random) {
            println("The client is served.")
        }
        return random
    }

    override fun work() {
        println("I'm serving")
    }
}