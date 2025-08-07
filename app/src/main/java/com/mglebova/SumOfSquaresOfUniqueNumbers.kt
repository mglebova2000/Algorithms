package com.mglebova

fun main() {
    val input = "7 5 3 3" // строка с целыми числами, которые разделены пробелами
    val actual = sumOfSquaresOfUniqueNumbers(input)
    val exptected = 83

    // суть (7*7) + (5*5) + (3*3) = 83 - берем только уникальные значения

    println("actual=$actual")
    println("exptected=$exptected")
}


fun sumOfSquaresOfUniqueNumbers(string: String): Int {
    return string
        .split(" ")
        .map { it.toInt() }
        .distinct()
        .map { it*it }
        .sum()

}