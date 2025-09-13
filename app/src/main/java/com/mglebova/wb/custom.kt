package com.mglebova.wb

fun main() {

    val expected = 1000
    val input = "при54ве-т@-10 ми2р-5 0 5 7 с-л-9000о!52во     3 3 10 10 сло1000во"
    val actual = maxNumber(input)



    println("exptected=$expected")
    println("actual=$actual")
}

fun maxNumber(string: String): Int {
    return string
        .map {
            if (it.isDigit() || it == '-') {
                it
            } else {
                " "
            }
        }.joinToString("")
        .split(" ")
        .mapNotNull { it.toIntOrNull() }
        .max()
}
