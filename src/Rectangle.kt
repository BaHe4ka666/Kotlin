package src

class Rectangle(
    val width: Int = 0, // присваивание значения по умолчанию
    val length: Int = 0
) {

    constructor(size: Int) : this(size, size) // перегрузка конструктора

    fun draw() {
        repeat(this.length) {
            repeat(this.width) {
                print("* ")
            }
            println("")
        }
    }
}