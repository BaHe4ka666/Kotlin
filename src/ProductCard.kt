package src

class ProductCard {
    val name: String
    val brand: String
    val size: Float
    val price: Int

    constructor(name: String, brand: String, size: Float, price: Int) {
        this.name = name
        this.brand = brand
        this.size = size
        this.price = price
    }

        fun printInfo() {
            print("Name: ${this.name}\nBrand: ${this.brand}\nSize: ${this.size}\nPrice: ${this.price}")
        }
    }