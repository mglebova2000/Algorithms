package com.mglebova
fun main() {
//    val spisok = listOf("1", "2", "3")
//    val newSpisok = spisok.map {
//        it.toInt()
//    }.map {
//        it+1
//    }.map {
//        it.toString()
//    }.map {
//        it+"5"
//    }.map {
//        it.toInt()
//    }
//    println(newSpisok)

    val strings = listOf("hdhshe", "hdhshshs", "fhsjjsjs")
    val ints = listOf(3, 5, 7)
    val expected = listOf("hdh3she", "hdhs5hshs", "fhsj7jsjs")
    val actual = listWithNumberInMiddle(strings, ints)

    println("expected=$expected")
    println("actual=$actual")
}
fun listWithNumberInMiddle(strings : List<String>, ints : List<Int>) : List<String> {
    return strings.mapIndexed { i, str ->
        stringWithNumberInMiddle(str,ints[i])
    }

}

fun stringWithNumberInMiddle(str: String, num: Int): String {
    val halfOfLength = str.length / 2
    val a = str.substring(0,halfOfLength)
    val b = str.substring(halfOfLength, str.length)
    val result: String = a + num + b
    return result
}
