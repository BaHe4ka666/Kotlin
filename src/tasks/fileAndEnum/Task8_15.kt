package src.tasks.fileAndEnum

import java.io.File

fun main() {
    val listUser = listOf<String>("1", "2", "3")
    val mutableListUser = mutableListOf<String>()
    for (user in listUser) {
        mutableListUser.add(user)
    }
    val operation = readln()
    when (operation) {
        "SHOW" -> {
            for (item in mutableListUser) {
                println(item)
            }
        }

        "ADD" -> {
            val name = readln()
            mutableListUser.add(name)
            for (item in mutableListUser) {
                println(item)
            }
        }

        "REMOVE" -> {
            val name = readln()
            mutableListUser.remove(name)
            for (item in mutableListUser) {
                println(item)
            }
        }

        "REMOVE_AT" -> {
            val index = readln().toInt()
            mutableListUser.removeAt(index)
            for (item in mutableListUser) {
                println(item)
            }
        }

        else -> println("Некорректное значение")
    }
}

