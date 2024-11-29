package src.tasks.task8_10

class AngleGrinder(
    val discDiameter: Int,
    val isSmoothStart: Boolean,
    val isDustProtection: Boolean,
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

