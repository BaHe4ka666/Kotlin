package src

fun main() {
    println("First name: ")
    val johnName = readln()
    println("First age: ")
    val johnAge = readln().toInt()
    println("First weight: ")
    val johnWeight = readln().toInt()
    println("First height: ")
    val johnHeight = readln().toInt()

    val john: Person = Person(name = johnName, age = johnAge, height = johnHeight, weight = johnWeight)


    println("Second name: ")
    val peterName = readln()
    println("Second age: ")
    val peterAge = readln().toInt()
    println("Second weight: ")
    val peterWeight = readln().toInt()
    println("Second height: ")
    val peterHeight = readln().toInt()

    val peter: Person = Person(name = peterName, age = peterAge, height = peterHeight, weight = peterWeight)

    john.printInfo()
    john.sayHello()

    peter.printInfo()
    peter.sayHello()

}