package src.corporation

import src.productCard.ProductCard
import src.productCard.ShoesCard
import src.productCard.FoodCard
import src.productCard.HouseholdApplianceCard

class Accountant(
    name: String,
    age: Int
) : Worker(name = name, age = age) {

    override fun work() {
        while (true) {
            print("Enter the operation code. 0 - Exit, 1 - register new item: ")
            val code = readln().toInt()
            if (code != 1) {
                break
            } else {
                println("Enter the product type: 1 - food, 2 - shoes, 3 - appliance")
                val typeCode = readln().toInt()
                cardFull(typeCode)
            }
        }
    }

    fun printHelp(): List<String> {
        val list = mutableListOf<String>()
        println("Enter the product name: ")
        list.add(readln())
        println("Enter the product brand: ")
        list.add(readln())
        println("Enter the product price: ")
        list.add(readln())
        return list
    }

    fun cardFull(typeCode: Int) {
        when (typeCode) {
            1 -> {
                println("Enter count of calories: ")
                val calories = readln().toInt()
                val list = printHelp()
                val foodCard = FoodCard(calories, list[0], list[1], list[2].toInt())
                foodCard.printInfo()
            }

            2 -> {
                println("Enter size: ")
                val size = readln().toInt()
                val list = printHelp()
                val shoesCard = ShoesCard(size, list[0], list[1], list[2].toInt())
                shoesCard.printInfo()
            }

            3 -> {
                println("Enter power: ")
                val power = readln().toInt()
                val list = printHelp()
                val applianceCard = HouseholdApplianceCard(power, list[0], list[1], list[2].toInt())
                applianceCard.printInfo()
            }
        }
    }
}

