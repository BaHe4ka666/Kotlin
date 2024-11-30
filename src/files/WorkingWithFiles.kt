package src.files

import java.io.File

fun main() {
    val file = File("test.txt")
    file.writeText("world") // добавить текст в файл (файл перезаписывается)
    file.appendText(" yo") // добавить новый текст в файл
}