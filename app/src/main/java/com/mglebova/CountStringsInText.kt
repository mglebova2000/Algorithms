package com.mglebova

fun main() {

    val actual = countStringInText(
        string = "mrr", text = "mkfemttmewmrrklmrrslkdsmrrlksemrjkdwjmrril"
    )

    val expected = 4

    println("actual=$actual expected=$expected")
}

fun countStringInText(string: String, text: String): Int {

    val windowSize = string.length
    var counter = 0

    for (i in 0 ..text.lastIndex){

        val windowLastIndexPlusOne = i + windowSize

        if (windowLastIndexPlusOne>text.lastIndex){
            break
        }

        val windowString = text.substring(i, windowLastIndexPlusOne)
        if (windowString == string){
            counter++
        }
    }
    return counter
}