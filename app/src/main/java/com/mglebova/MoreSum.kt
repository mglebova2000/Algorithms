package com.mglebova

fun main() {
    val arr = listOf<Int>(2, 4, 3, 5, 6)
    val goal1 = 8
    val goal2 = 12
    val goal3 = 17

    val actual1 = indexesWithMoreSum(arr, goal1)
    val expected1 = "0-2"
    println("$actual1 $expected1")
    val actual2 = indexesWithMoreSum(arr, goal2)
    val expected2 = "0-3"
    println("$actual2 $expected2")
    val actual3 = indexesWithMoreSum(arr, goal3)
    val expected3 = "0-4"
    println("$actual3 $expected3")
}

fun indexesWithMoreSum(listInt: List<Int>, goal: Int): String {

    var sumElement = 0
    listInt.forEachIndexed { index, item ->
        sumElement += item
        if (sumElement > goal) {
            return "0-$index"
        }
    }
    throw Exception("number goal is too high")
}
