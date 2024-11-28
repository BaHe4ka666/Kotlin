package src

class TaskCar {
    val brand: String
    val model: String
    val enginePower: Int
    val bodyColor: String

    constructor(brand: String, model: String, enginePower: Int, bodyColor: String) {
        this.brand = brand
        this.model = model
        this.enginePower = enginePower
        this.bodyColor = bodyColor
    }

    fun printInfo() {
        println("$brand $model $enginePower л.с. $bodyColor")
    }
}

fun task() {
    val info = readln().split(" ")
    val car = TaskCar(brand = info[0], model = info[1], enginePower = info[2].toInt(), bodyColor = info[3])
    car.printInfo()
}