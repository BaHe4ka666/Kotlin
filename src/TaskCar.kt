package src

class TaskCar {
        var brand: String = ""
        var model: String = ""
        var enginePower: Int = 0
        var bodyColor: String = ""

        fun drive() {
                if (this.enginePower >= 120) {
                        println("Еду быстро, но недалеко на ${this.brand} ${this.model}")
                } else {
                        println("Еду далеко, но небыстро на ${this.brand} ${this.model}")
                }

        }

        //fun refuel(place: String, gas: String, count: Int) {
        //        println("Произведена заправка на АЗС \"$place\"\n" +
        //        "Марка бензина: $gas\nКол-во литров: $count")
        //}

        fun init(brand: String, model: String, enginePower: Int, bodyColor: String) {
                this.brand = brand
                this.model = model
                this.enginePower = enginePower
                this.bodyColor = bodyColor
        }
}

fun task() {
        val car = TaskCar()
        val info = readln().split(" ")
        car.init(brand = info[0], model = info[1], enginePower = info[2].toInt(), bodyColor = info[3])
        car.drive()
}