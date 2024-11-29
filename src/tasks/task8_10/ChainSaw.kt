package src.tasks.task8_10

class ChainSaw(
    val chainSawTireLength: Int,
    val chainLinksCount: Int,
    val chainStep: Double,
    brand: String,
    model: String,
    power: Int,
    weight: Double,
    cableLength: Int,
    price: Price,
    voltage: Int
) : PowerTool(
    brand = brand,
    model = model,
    power = power,
    weight = weight,
    cableLength = cableLength,
    price = price,
    voltage = voltage
)
