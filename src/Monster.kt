package src

import kotlin.random.Random

class Monster {
    val pawsCount: Int
    val eyesCount: Int
    val fangsCount: Int
    val clawsCount: Int
    val tentaclesCount: Int

    constructor(pawsCount: Int, eyesCount: Int, fangsCount: Int, clawsCount: Int, tentaclesCount: Int) {
        this.pawsCount = pawsCount
        this.eyesCount = eyesCount
        this.fangsCount = fangsCount
        this.clawsCount = clawsCount
        this.tentaclesCount = tentaclesCount
    }

    constructor(limbs: Int) : this(limbs, limbs, limbs, limbs, limbs)

    constructor() : this(Random.nextInt(1, 10))

    fun printInfo() {
        println("Кол-во лап: $pawsCount\n" +
                "Кол-во глаз: $eyesCount\n" +
                "Кол-во клыков: $fangsCount\n" +
                "Кол-во когтей: $clawsCount\n" +
                "Кол-во щупалец: $tentaclesCount")
    }
}
