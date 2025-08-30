//Описание: Написать функцию, которая проверяет, является ли строка палиндромом (читается одинаково слева направо и
//справа налево), игнорируя регистр и не буквенно-цифровые символы. (Проверяет: работа со строками, циклы, условия)
//
//Задание: Напишите метод fun PalindromeStr(str: String): Boolean, который возвращает true, если строка str
//является палиндромом (игнорируя регистр и не буквенно-цифровые символы), и false в противном случае.
//
//Пример: isPalindrome("A man, a plan, a canal: Panama") -> true, isPalindrome("race a car") -> false,
//isPalindrome(" ") -> true.

fun main() {
    val result1 = PalindromeStr ("A man, a plan, a canal: Panama")
    val result2 = PalindromeStr ("race a car")
    println(result1)
    println(result2)
}

fun PalindromeStr(str: String): Boolean{

    val cleanStrReverse = str.lowercase().filter { it.isLetterOrDigit() }

    return cleanStrReverse == cleanStrReverse.reversed()
}