
fun main() {
    val input = listOf(2,5,6)
    val exptected = listOf("2@2","5@5","6@6")
    val actual = listOfIntWithChar(input)

    println("actual=$actual")
    println("exptected=$exptected")
}

fun listOfIntWithChar(list: List<Int>): List <String> {
    return list
        .map { "$it@$it" }
}