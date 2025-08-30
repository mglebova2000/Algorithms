//Проверка на анаграммы (Anagram Check)
//Описание: Написать функцию, которая проверяет, являются ли две строки анаграммами друг друга (состоят из одних и
//тех же символов в разном порядке). (Проверяет: работа со строками, сортировка/Map, сравнение)
//
//Задание: Напишите метод fun areAnagrams(str1: String, str2: String): Boolean, который возвращает true, если
//строки str1 и str2 являются анаграммами (игнорируя регистр и пробелы), и false иначе.
//
//Пример: areAnagrams("listen", "silent") -> true, areAnagrams("Dormitory", "dirty room") -> true,
//areAnagrams("hello", "world") -> false.

fun main() {
    val result = areAnagrams("listen", "silent")
    println(result)
}

fun areAnagrams(str1: String, str2: String): Boolean{
    val cleanStr1 = str1.lowercase().filter { !it.isWhitespace() }
    val cleanStr2 = str2.lowercase().filter { !it.isWhitespace() }

   return if (cleanStr1.toCharArray().sorted() == cleanStr2.toCharArray().sorted()){
        true
    } else false
}