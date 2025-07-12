package com.mglebova

fun main() {
    val list = listOf(46, 48, 49, 50, 49, 46, 47, 48, 500, 47, 48, 50)

    val actual = median(list)

    val expected = 48

    println("actual=$actual, expected=$expected")
}

fun median(list: List<Int>): Int {

    // 1. sort
    val sortedList = list.sorted()

    // 2. количество значений
    val numbersSize = list.size

    // 3. четное или нет
    val remainder = numbersSize % 2
    val isEven = if (remainder == 0) true else false

    // 4. если нечетное значение то берешь посередине отсортированного списка
    // если четное то берешь посередине 2 числа и считаешь их среднее арифметическое
    if (isEven) {
        // четн
        val indexOfSecondMiddleValue = numbersSize / 2
        val indexOfFirstMiddleValue = indexOfSecondMiddleValue - 1
        val secondValue = sortedList[indexOfSecondMiddleValue]
        val firstValue = sortedList[indexOfFirstMiddleValue]

        val middleArithmetic = (secondValue + firstValue) / 2
        return middleArithmetic
    } else {
        //нечетн
        val indexOfMiddleValue = numbersSize / 2
        return sortedList[indexOfMiddleValue]
    }
}
