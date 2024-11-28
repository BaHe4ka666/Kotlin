import src.Assistant
import src.ProductCard

fun main() {
    print("Enter name: ")
    val name = readln()

    print("Enter brand: ")
    val brand = readln()

    print("Enter size: ")
    val size = readln().toFloat()

    print("Enter price: ")
    val price = readln().toInt()

    val productCard = ProductCard()

    productCard.init(name = name, brand = brand, size = size, price = price) //именованные параметры
    productCard.printInfo()
}
