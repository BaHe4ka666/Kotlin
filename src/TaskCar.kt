package src

class TaskCar {
        var brand: String = ""
        var model: String = ""
        var enginePower: Int = 0
        var bodyColor: String = ""

        fun drive() {
                println("Еду на автомобиле")
        }
        fun refuel(place: String, gas: String, count: Int) {
                println("Произведена заправка на АЗС \"$place\"\n" +
                "Марка бензина: $gas\nКол-во литров: $count")
        }
}
fun task() {
        val car = TaskCar()
        val info = readln().split(" ")
        car.refuel(info[0], info[1], info[2].toInt())
}