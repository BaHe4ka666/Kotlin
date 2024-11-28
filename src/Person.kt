package src

class Person {
    var name: String = ""
    var age: Int = 0
    var weight: Int = 0
    var height: Int = 0

    fun sayHello() {
        println("Hello, my name is ${this.name}")
    }

    fun run() {
        repeat(10) {
            println("I run!")
        }
    }

    fun init(name: String, age: Int, weight: Int, height: Int) {
        this.name = name
        this.age = age
        this.weight = weight
        this.height = height
    }

    fun printInfo() {
        println("Name: $name\nAge: $age\nWeight: $weight\nHeight: $height")
    }
}