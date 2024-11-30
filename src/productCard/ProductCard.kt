package src.productCard

open class ProductCard(
    val name: String,
    val brand: String,
    val price: Int
) {
    open fun printInfo() {
        println("Name: ${this.name}\nBrand: ${this.brand}\nPrice: ${this.price}")
    }
}