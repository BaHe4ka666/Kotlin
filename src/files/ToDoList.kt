package src.files

import src.files.OperationCode
import java.io.File

fun main() {
    val file = File("todo_list.txt")
    val operationCode = OperationCode.entries
    while (true) {
        print("Enter the operation code. ")
        for ((index, operation) in operationCode.withIndex()) {
            if (index < operationCode.size - 1) {
                print("$index - ${operation.title}, ")
            } else {
                print("$index - ${operation.title}: ")
            }
        }
        val index = readln().toInt()
        val operation = operationCode[index]
        when (operation) {
            OperationCode.EXIT -> break
            OperationCode.WRITE_IN_FILE -> {
                print("Enter your note: ")
                val note = readln()
                file.appendText("$note\n")
            }

            OperationCode.READ_FILE -> {
                val content = file.readText().trim()
                val listOfContent = content.split("\n")
                for ((index, content) in listOfContent.withIndex()) {
                    print("$index - $content\n")
                }
            }
        }
    }

//    while (true) {
//        println("Enter your deal today. If you add all deals enter 0 to end list.")
//        val todo = readln()
//        if (todo != "0") {
//            file.appendText("$todo\n")
//        } else {
//            break
//        }
//    }
//    println(file.readText())
}