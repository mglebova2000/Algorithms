
fun main() {

    val string = "HelloAQAEngineer"
    val actual = reverse(string)
    val expected = "reenignEAQAolleH"
    println("actual=$actual expected=$expected")
}

fun reverse(x: String): String {
    val listOfChars = x.toList()
    var reversedString = ""

    for (i in listOfChars.lastIndex downTo 0){
        reversedString += listOfChars[i]
    }
    return reversedString
    }