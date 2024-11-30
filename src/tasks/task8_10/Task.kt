package src.tasks.task8_10

fun main() {
//    val price = Price(0, 0, 0)
//    val angleGrinder = AngleGrinder(0, true, true, " ", " ", 0, 0.0, 0, price)
//    val chainSaw = ChainSaw(0, 0, 0.0, " ", " ", 0, 0.0, 0, price)
//    val drill = Drill(0, 0, 0, " ", " ", 0, 0.0, 0, price)
//    val powerTools = listOf(angleGrinder, chainSaw, drill)
//    for (tool in powerTools) {
//        tool.turnOn()
//    }
    val daysOfWeek = DaysOfWeek.entries
    for (day in daysOfWeek) {
        println(day.title)
    }
}