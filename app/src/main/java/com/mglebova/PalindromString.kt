fun main() {
    println(isPalindrome("Aba") == true)        // true
    println(isPalindrome("race a car") == false) // true
}
fun isPalindrome(s: String): Boolean {

    val text = s
        .lowercase()
        .filter { it.isDigit() || it.isLetter() }

    return text == text.reversed()
}