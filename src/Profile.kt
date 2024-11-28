package src

fun main() {
    val john: Person = Person()
    println("First name: ")
    val johnName = readln()
    println("First age: ")
    val johnAge = readln().toInt()
    println("First weight: ")
    val johnWeight = readln().toInt()
    println("First height: ")
    val johnHeight = readln().toInt()

    val peter: Person = Person()
    println("Second name: ")
    val peterName = readln()
    println("Second age: ")
    val peterAge = readln().toInt()
    println("Second weight: ")
    val peterWeight = readln().toInt()
    println("Second height: ")
    val peterHeight = readln().toInt()


    john.init(name = johnName, age = johnAge, height = johnHeight, weight = johnWeight)
    john.printInfo()
    john.sayHello()

    peter.init(name = peterName, age = peterAge, height = peterHeight, weight = peterWeight)
    peter.printInfo()
    peter.sayHello()

}