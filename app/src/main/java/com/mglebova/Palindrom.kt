package com.mglebova

fun main() {
    val number1 = 9008009
    val number2 = 70080099

    val b1 = isPalindrome(number1)
    val b2 = isPalindrome(number2)

    println(b1)
    println(b2)
}


fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    }

    val valueOfPalindrome = x.toString()
    val reservedValueOfPalindrome = x.toString().reversed()
    if (valueOfPalindrome == reservedValueOfPalindrome) {
        return true
    } else {
        return false
    }
}