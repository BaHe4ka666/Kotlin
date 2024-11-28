package src

fun main() {
    val john: Person = Person()
    println("First name: ")
    john.name = readln()
    println("First age: ")
    john.age = readln().toInt()
    println("First weight: ")
    john.weight = readln().toInt()
    println("First height: ")
    john.height = readln().toInt()

    val peter: Person = Person()
    println("Second name: ")
    peter.name = readln()
    println("Second age: ")
    peter.age = readln().toInt()
    println("Second weight: ")
    peter.weight = readln().toInt()
    println("Second height: ")
    peter.height = readln().toInt()

    println("Name: ${john.name}\nAge: ${john.age}\nWeight: ${john.weight}\nHeight: ${john.height}\n" +
            "Name: ${peter.name}\nAge: ${peter.age}\nWeight:${peter.weight}\nHeight: ${peter.height}")

    john.sayHello()
    peter.sayHello()

    john.run()
    peter.run()
}