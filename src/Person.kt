package src

class Person {
    val name: String
    val age: Int
    val weight: Int
    val height: Int

    constructor(name: String, age: Int, weight: Int, height: Int) {
        this.name = name
        this.age = age
        this.weight = weight
        this.height = height
    }

    fun sayHello() {
        println("Hello, my name is ${this.name}")
    }

    fun run() {
        repeat(10) {
            println("I run!")
        }
    }

    fun printInfo() {
        println("Name: $name\nAge: $age\nWeight: $weight\nHeight: $height")
    }
}