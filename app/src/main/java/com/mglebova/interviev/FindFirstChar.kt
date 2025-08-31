//Найти первый неповторяющийся символ в строке (Find First Non-Repeating Character)
//Описание: Написать функцию, которая находит первый символ в строке, который встречается только один раз. (
//Проверяет: работа со строками, Map/массивы для счетчиков, циклы)
//
//Задание: Напишите метод fun findFirstNonRepeatingChar(str: String): Char?, который находит и возвращает первый
//символ в строке str, который встречается только один раз. Если такого символа нет, верните null.
//
//Пример: findFirstNonRepeatingChar("swiss") -> 'w', findFirstNonRepeatingChar("aabbcc") -> null.

fun main() {

    val str : String? = null

    val res = str!!.lowercase().uppercase().lowercase()

    val result = findFirstNonRepeatingChar("swiss") // ожидаем 'w'
    println(result)
}

fun findFirstNonRepeatingChar(str: String): Char? {
    var mapOfChar = mutableMapOf<Char, Int>()

    str.forEach { ch ->
        if (mapOfChar.contains(ch)) {
            val oldValue = mapOfChar.get(ch)!!
            mapOfChar.put(ch, oldValue + 1)
        } else {
            mapOfChar.put(ch, 1)
        }
    }

    str.forEach { ch ->
        if (mapOfChar.get(ch) == 1){
            return ch
        }
    }
    return null
}