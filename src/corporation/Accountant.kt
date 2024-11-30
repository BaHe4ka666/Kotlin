package src.corporation

import src.productCard.ShoesCard
import src.productCard.FoodCard
import src.productCard.HouseholdApplianceCard

class Accountant(
    name: String,
    age: Int
) : Worker(name = name, age = age) {

    override fun work() {
        while (true) {
            print("Enter the operation code. ")
            val operationCode = OperationCode.entries
            for ((index,code) in operationCode.withIndex()) {
                print("$index - ${code.title}")
                if (index < operationCode.size - 1) {
                    print(", ")
                } else {
                    print(": ")
                }
            }
            val index = readln().toInt()
            val code = operationCode[index]
            when (code) {
                OperationCode.EXIT -> break
                OperationCode.REGISTER_NEW_ITEM -> registerNewItem()
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

    fun registerNewItem() {
        val productType = ProductType.entries// получение коллекции из enum класса
        print("Enter the product type: ")
        for ((index, type) in productType.withIndex()) {// если нужен доступ к порядковым номерам элемента
            print("${index + 1} - ${type.title}")
            if (index < productType.size - 1) {
                print(", ")
            } else {
                print(": ")
            }
        }
        val index = readln().toInt()
        val product = productType[index - 1]//получение из коллекции типа продукта из коллекции productType
        when (product) {
            ProductType.FOOD -> {
                println("Enter count of calories: ")
                val calories = readln().toInt()
                val list = printHelp()
                val foodCard = FoodCard(calories, list[0], list[1], list[2].toInt())
                foodCard.printInfo()
            }

            ProductType.SHOES -> {
                println("Enter size: ")
                val size = readln().toInt()
                val list = printHelp()
                val shoesCard = ShoesCard(size, list[0], list[1], list[2].toInt())
                shoesCard.printInfo()
            }

            ProductType.APPLIANCE -> {
                println("Enter power: ")
                val power = readln().toInt()
                val list = printHelp()
                val applianceCard = HouseholdApplianceCard(power, list[0], list[1], list[2].toInt())
                applianceCard.printInfo()
            }
        }
    }
}

