package com.mglebova.wb

fun main() {

    val expected = listOf<Int>(0, 9, 25, 25, 49, 100, 100)
    val input = "привет -10 мир  -5 0 5 7 слово 3 3 10 10 слово"
    val actual = sqrtSortedNumbersOfString(input)

    println("exptected=$expected")
    println("actual=$actual")
}

fun sqrtSortedNumbersOfString(string: String): List<Int> {
    return string
        .split(" ")
        .mapNotNull { word -> word.toIntOrNull() }
        .distinct()
        .map { number -> number*number }
        .sorted()
}
