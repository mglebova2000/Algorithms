package com.mglebova

fun main() {
    val list = listOf(46, 48, 49, 50, 49, 46, 47, 48, 500, 47, 48, 50)

    val actual = middleArithmetic(list)

    val expected = 85.66667f

    println("actual=$actual, expected=$expected")

}

fun middleArithmetic(list: List<Int>): Float {
    val numbersSize = list.size
    var sum = 0

    list.forEach {
        sum+=it
    }

    val middleArifthetic = sum.toFloat() / numbersSize

    return middleArifthetic
}