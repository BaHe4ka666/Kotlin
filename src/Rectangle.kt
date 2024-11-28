package src

class Rectangle {
    val width: Int
    val length: Int

    constructor(width: Int, length: Int) {
        this.width = width
        this.length = length
    }

    constructor(size: Int): this(size, size) // перегрузка конструктора

    constructor(): this(0) // перегрузка конструктора

    fun draw() {
        repeat(this.length) {
            repeat(this.width) {
                print("* ")
            }
            println("")
        }
    }
}