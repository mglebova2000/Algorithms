package com.mglebova

fun main() {

    val numbersInStr = listOf<String>("ONE", "ZERO", "FOUR", "SIX", "TEN")

    val maxInt: Int = maxIndexOfNumber(numbersInStr)

    println(maxInt)
}

fun maxIndexOfNumber(numbersInStr: List<String>): Int {
    val map = mapOf(
        "ZIRO" to 0,
        "ONE" to 1,
        "TWO" to 2,
        "THREE" to 3,
        "FOUR" to 4,
        "FIVE" to 5,
        "SIX" to 6,
        "SEVEN" to 7,
        "EIGHT" to 8,
        "NINE" to 9,
        "TEN" to 10
    )

    val newList = numbersInStr.map {
        map.get(it) ?: -1
    }
    var indexOfMaxValue = -1
    var maxValue = -1

    newList.forEachIndexed { index, numberNewList ->
        if (numberNewList > maxValue){
            indexOfMaxValue = index
            maxValue = numberNewList
        }
    }
    return indexOfMaxValue
}

