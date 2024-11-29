package src

class ProductCard(
    val name: String,
    val brand: String,
    val size: Float = 0f,
    val price: Int = 0
) {

    fun printInfo() {
        print("Name: ${this.name}\nBrand: ${this.brand}\nSize: ${this.size}\nPrice: ${this.price}")
    }
}