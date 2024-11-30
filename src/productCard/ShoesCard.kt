package src.productCard

class ShoesCard(
    val size: Int,
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
        println("Size: ${this.size}")
    }
}