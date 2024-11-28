package src

class Person {
    var name: String = ""
    var age: Int = 0
    var weight: Int = 0
    var height: Int = 0

    fun sayHello() {
        println("Hello!")
    }

    fun run() {
        repeat(10) {
            println("I run!")
        }
    }
}