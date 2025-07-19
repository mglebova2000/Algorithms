package com.mglebova

fun main() {
    val numbers = listOf(1, 5, 2, 5, 6, 8)
    val texts = listOf("Alex", "Maryna", "Kris", "John", "Ann", "Andrew")


    val expected = "Alex->1,Maryana->5,Kris->2,John->5,Ann->6,Andrew->8"
    val actual = join(numbers,texts)

    println("expected = $expected")
    println("actual = $actual")
}

fun join(numbers: List<Int>, texts: List<String>) : String {
    val symbol = "->"
    val list = mutableListOf<String>()

    for (i in 0..texts.lastIndex){
       list.add("${texts[i]}$symbol${numbers[i]}")
    }

    return list.joinToString(",")
}
