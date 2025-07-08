package com.mglebova

fun main() {

    val number = 46738
    val reversedNumber = reverse(number)
    println(reversedNumber)
}

fun reverse(x: Int): Int {
    var string = x.toString()
    val listOfChars = string.toList()
    var reversedString = ""

    for (i in listOfChars.lastIndex downTo 0) {
     reversedString += listOfChars.get(i)
    }
    return reversedString.toInt()
}


//val list = listOf(1,2,3,456,877,98,43,35436,6,456,46,43,534,5,523)
//
//for (i in list.lastIndex downTo 0){
//    println(list.get(i))
//}