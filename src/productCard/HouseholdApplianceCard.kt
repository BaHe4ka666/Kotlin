package src.productCard

import src.tasks.task8_10.Price

class HouseholdApplianceCard(
    val power: Int,
    name: String,
    brand: String,
    price: Int
) : ProductCard(
    name = name,
    brand = brand,
    price = price
) {
    override fun printInfo() {
        super.printInfo()
        println("Power: ${this.power}")
    }
}