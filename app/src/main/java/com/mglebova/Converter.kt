package com.mglebova

fun main() {

    val str = "AAADEF"
    str.mapToSumOfNumbers()

    val actual = str.mapToSumOfNumbers()
    val exptected = 27

    println("actual=$actual")
    println("exptected=$exptected")

}


private fun String.mapToSumOfNumbers() : Int {

    val dict = mapOf(
        'A' to 5, 'B' to 2, 'C' to 8, 'D' to 4, 'E' to 7,
        'F' to 1, 'G' to 3, 'H' to 3
    )

    val strChars = this.toList()
    var sumStr = 0
    strChars.forEach { char ->
        val number = dict.get(char) ?: 0
        sumStr += number
    }
    return sumStr
}
