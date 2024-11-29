package src.Task8_9

fun main() {
    val info = readln().split(" ")
    val deliveryObject = DeliveryObject(
        length = info[0].toInt(),
        width = info[1].toInt(),
        height = info[2].toInt(),
        weight = info[3].toDouble()
    )
    val warehouse = Warehouse()
    warehouse.getPack(deliveryObject)
    val cargo = warehouse.packCargo(deliveryObject)
    cargo.printInfo()
}