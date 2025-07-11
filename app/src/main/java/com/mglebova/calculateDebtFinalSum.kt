package com.mglebova

fun main() {
    val actual = calculateDebtFinalSum(
        sum = 100000,
        percent = 0.3f,
        years = 3
    )
    val expected = 219700
    println("actual=$actual expected=$expected")
}

fun calculateDebtFinalSum(
    sum: Int,
    percent: Float,
    years: Int,
): Int {
    var debt : Float = sum.toFloat()

    repeat(years){
        debt*=1+percent
    }

    return debt.toInt()
}
