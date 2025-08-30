//Перевернуть строку (Reverse String)
//Описание: Написать функцию, которая принимает строку и возвращает её в перевернутом виде. (Проверяет: работа со
//строками, циклы/рекурсия/StringBuilder)
//
//Задание: Напишите метод fun reverseString(str: String): String, который принимает строку и возвращает новую
//строку, являющуюся перевернутой версией исходной.
//
//Пример: reverseString("hello") -> "olleh", reverseString("Java") -> "avaJ".

fun main() {
    val result = reverseString("hello")
    println(result)
}

fun reverseString(str: String): String {
    val strToChar = str.toCharArray()
    var reverseStr = ""

    for (i in strToChar.lastIndex downTo 0){
        reverseStr += strToChar[i]
    }
    return reverseStr
}