package com.mglebova

fun main() {

    val chars = listOf<Char>('h', 'g', 'k', 'l', 'i')
    val bools = listOf<Boolean>(true, true, true, false, false)
    val numbers = listOf<Int>(6, 8, 2, 9, 0)

    val actual = combine(chars, numbers, bools)
    val expected = "h16g18k12l09i00"

    println("expected=$expected")
    println("actual=$actual")

}

fun combine(
    chars: List<Char>,
    numbers: List<Int>,
    bools: List<Boolean>
): String {
    val boolsList = mutableListOf<Int>()
    val combineList = mutableListOf<String>()

    bools.forEach {
        if (it) {
            boolsList.add(1)
        } else boolsList.add(0)
    }
    for (i in 0..chars.lastIndex){
        combineList.add("${chars[i]}${boolsList[i]}${numbers[i]}")
    }
    return combineList.joinToString("")
}
