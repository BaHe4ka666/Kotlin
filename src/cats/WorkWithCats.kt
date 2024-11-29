package src.cats

fun main() {
    val cat = Cat("Boris")
    val lion = Lion(countInPride = 24)
    println(cat.legsCount)
    println(cat.name)
    println(lion.countInPride)
    println(lion.legsCount)
    cat.playWithMouse()
}