fun main() {
    val input = listOf(5, 6, 7, 8)
    val exptected = listOf(6, 8)
    val actual = listOfEvenNumbers(input)

    println("actual=$actual")
    println("exptected=$exptected")
}

fun listOfEvenNumbers(list: List<Int>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    list.forEach { number ->
        if (number%2==0) {
            evenNumbers.add(number)
        }
    }
    return evenNumbers
}