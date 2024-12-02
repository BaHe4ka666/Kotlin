package src.corporation

import src.productCard.ShoesCard
import src.productCard.FoodCard
import src.productCard.HouseholdApplianceCard
import src.productCard.ProductCard
import java.io.File

class Accountant(
    name: String,
    age: Int
) : Worker(name = name, age = age) {

    val file = File("product_card.txt")

    override fun work() {
        while (true) {
            print("Enter the operation code. ")
            val operationCode = OperationCode.entries
            for ((index, code) in operationCode.withIndex()) {
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
                OperationCode.SHOW_ALL_ITEMS -> showAllItems()
                OperationCode.DELETE_PRODUCT_CARD -> removeProductCard()
            }
        }
    }

    fun saveProductCardToFile(card: ProductCard) {
        file.appendText("${card.name}%")
        file.appendText("${card.brand}%")
        file.appendText("${card.price}%")
        when {
            card is FoodCard -> {
                val calories = card.countOfCalories
                file.appendText("$calories%${ProductType.FOOD}\n")
            }

            card is ShoesCard -> {
                val size = card.size
                file.appendText("$size%${ProductType.SHOES}\n")
            }

            card is HouseholdApplianceCard -> {
                val size = card.power
                file.appendText("$size%${ProductType.APPLIANCE}\n")
            }
        }
    }

    fun removeProductCard() {
        val cards = loadAllCards()
        println("Enter the name of card for remove: ")
        val nameOfCard = readln()
        for ((index, card) in cards.withIndex()) {
            if (card.name == nameOfCard) {
                cards.removeAt(index)
                break
            }
        }
        file.writeText("")
        for (card in cards) {
            saveProductCardToFile(card)
        }
    }

    fun loadAllCards(): MutableList<ProductCard> {
        val cards = mutableListOf<ProductCard>()
        val infoAsFile = file.readText().trim()
        val infoAsString = infoAsFile.split("\n")
        for (info in infoAsString) {
            val properties = info.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            val type = properties.last()
            val productType = ProductType.valueOf(type)
            val productCard = when (productType) {
                ProductType.FOOD -> {
                    val calories = properties[3].toInt()
                    FoodCard(name, brand, price, calories)
                }

                ProductType.SHOES -> {
                    val size = properties[3].toInt()
                    ShoesCard(name, brand, price, size)
                }

                ProductType.APPLIANCE -> {
                    val power = properties[3].toInt()
                    HouseholdApplianceCard(name, brand, price, power)
                }
            }
            cards.add(productCard)
        }
        return cards
    }

    fun showAllItems() {
        val infoAsFile = file.readText().trim()
        if (infoAsFile.isEmpty()) {
            return                   //выход из метода
        }
        val infoAsString = infoAsFile.split("\n")
        for (info in infoAsString) {
            val properties = info.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            val type = properties.last()
            val productType = ProductType.valueOf(type)
            val productCard = when (productType) {
                ProductType.FOOD -> {
                    val calories = properties[3].toInt()
                    FoodCard(name, brand, price, calories)
                }

                ProductType.SHOES -> {
                    val size = properties[3].toInt()
                    ShoesCard(name, brand, price, size)
                }

                ProductType.APPLIANCE -> {
                    val power = properties[3].toInt()
                    HouseholdApplianceCard(name, brand, price, power)
                }
            }
            productCard.printInfo()
        }
    }


    fun printHelp(): List<String> {
        val list = mutableListOf<String>()
        println("Enter the product name: ")
        val productName = readln()
        file.appendText("$productName%")
        list.add(name)
        println("Enter the product brand: ")
        val productBrand = readln()
        file.appendText("$productBrand%")
        println("Enter the product price: ")
        val productPrice = readln().toInt()
        file.appendText("$productPrice%")
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
                printHelp()
                println("Enter count of calories: ")
                val calories = readln().toInt()
                file.appendText("$calories%")
            }

            ProductType.SHOES -> {
                printHelp()
                println("Enter size: ")
                val size = readln().toInt()
                file.appendText("$size%")

            }

            ProductType.APPLIANCE -> {
                printHelp()
                println("Enter power: ")
                val power = readln().toInt()
                file.appendText("$power%")
            }
        }
        file.appendText("$product\n")
    }
}


