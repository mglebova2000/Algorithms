package com.mglebova

fun main() {
    val input = "привет 7 мир 5 7 3" // строка с целыми числами, которые разделены пробелами
    val actual = sumOfSquaresOfUniqueNumbersVr2(input)
    val exptected = listOf(9,25,49)

    // суть (7*7) + (5*5) + (3*3) = 83 - берем только уникальные значения

    println("actual=$actual")
    println("exptected=$exptected")
}


fun sumOfSquaresOfUniqueNumbersVr2(string: String): List <Int> {
    return string
        .split(" ")
        .map { it.toIntOrNull() }
        .filterNotNull()
        .distinct()
        .map { it*it }
        .sortedDescending()
}