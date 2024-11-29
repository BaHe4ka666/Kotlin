package src.cats

class Cat(
    val name: String
) : CatsFamily() {

    fun playWithMouse() {
        println("I play with mouse!")
    }
}