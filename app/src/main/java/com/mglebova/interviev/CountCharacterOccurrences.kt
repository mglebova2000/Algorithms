import com.mglebova.interviev.findDuplicates

//### Посчитать количество вхождений символа в строке (Count Character Occurrences)
//
//* **Описание:** Написать функцию, которая подсчитывает, сколько раз каждый символ встречается в строке. (Проверяет:
//работа со строками, Map, циклы)
//* **Задание:** Напишите метод `Map<Character, Integer> countCharacters(String str)`, который возвращает Map, где
//ключами являются символы из строки `str`, а значениями - количество их вхождений.
//* **Пример:** `countCharacters("hello world")` ->
//`{'h': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1}`.

fun main() {
    val resoult = countCharacters("hello world")
    println(resoult)
}

fun countCharacters(str: String): Map<Char, Int> {
    var mapOfChar = mutableMapOf<Char, Int>()
    val newStr = str.filter { it != ' ' }

    newStr.forEach { char ->
        if (mapOfChar.contains(char)) {
            val oldValue = mapOfChar.get(char)!!
            mapOfChar.put(char, oldValue + 1)
        } else {
            mapOfChar.put(char, 1)
        }
    }
    return mapOfChar
}