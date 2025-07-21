package com.mglebova

fun main() {

    val strings = listOf("Hello","jurai","mombair","zagut")

    val actual : String = middleChars(strings)
    val expected = "l:r:b:g"

    println("expected=$expected")
    println("actual=$actual")
}

fun middleChars(strings: List<String>): String {
    val listOfMiddleChars = mutableListOf<Char>()

    strings.forEach { str ->
        val indexOfMiddle = str.length / 2
        val charInMiddle = str[indexOfMiddle]
        listOfMiddleChars.add(charInMiddle)
    }

    return listOfMiddleChars.joinToString (":")
}
