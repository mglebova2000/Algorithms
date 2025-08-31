package com.mglebova.interviev

fun main() {

    val str = listOf<Int>(1, 2, 4, 6)
    val popaList = mutableListOf<Int>()

    str.forEach { num ->
        var popa = num - 1
        popaList.add(popa)
    }
    println(popaList)

    val newList = str.map { it - 1 }

    println(newList)
}

fun String.addDolor() : String {
    return this+"$"
}