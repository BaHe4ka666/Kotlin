package src.Task8_9

class Warehouse {
    fun getPack(deliveryObject: DeliveryObject): Pack {
        val pack = Pack(
            length = deliveryObject.length++,
            width = deliveryObject.width++,
            height = deliveryObject.height++,
            weight = 0.3
        )
        return pack
    }

    fun packCargo(deliveryObject: DeliveryObject): Cargo {
        val pack = getPack(deliveryObject)
        val cargo = Cargo(
            length = pack.length,
            width = pack.width,
            height = pack.height,
            typePackaging = pack.type,
            netWeight = deliveryObject.weight,
            grossWeight = pack.weight + deliveryObject.weight
        )
        return cargo
    }
}
