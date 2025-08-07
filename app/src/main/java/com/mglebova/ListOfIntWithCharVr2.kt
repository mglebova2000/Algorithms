fun main() {
    val input = listOf("!", "2", "g")
    val exptected = listOf("-!","-2","-g")
    val actual = listOfIntWithChar(input)

    println("actual=$actual")
    println("exptected=$exptected")
}

fun listOfIntWithChar(list: List<String>): List <String> {
    return list
        .map { "-$it" }
}