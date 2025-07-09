package com.mglebova
fun main() {

    val number1 : Long = 982312412
    val number2 : Long = 773452778

    val queue = joinInQueue(number1,number2)

    val expected = 978723341522471728
    println("expected=$expected")
    println("actual=$queue")

}

fun joinInQueue(first: Long, second: Long) : Long {
    val firstListOfChar = first.toString().toList()
    val secondListOfChar = second.toString().toList()
    val resultListOfChar = mutableListOf<Char>()

   for (i in 0 .. firstListOfChar.lastIndex) {
        resultListOfChar.add(firstListOfChar[i])
        resultListOfChar.add(secondListOfChar[i])
    }
    return resultListOfChar.joinToString("").toLong()
}
