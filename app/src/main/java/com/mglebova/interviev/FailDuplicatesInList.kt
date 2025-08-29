package com.mglebova.interviev

//Найти дубликаты в массиве/списке (Find Duplicates in Array/List)
//Описание: Написать функцию, которая находит и возвращает дублирующиеся элементы в массиве или списке целых
//чисел/строк. (Проверяет: работа с коллекциями, Set/Map, циклы)
//
//Задание: Напишите метод fun findDuplicates(numbers: List<Int>): List<Int>, который принимает список целых
//чисел и возвращает список уникальных чисел, которые встречаются в исходном списке более одного раза.
//
//Пример: findDuplicates(listOf(1, 2, 3, 2, 4, 5, 1, 5)) -> [1, 2, 5] (порядок не важен, можно вернуть
//Set).

fun main() {
    val duplicates = findDuplicates(listOf(1, 2, 3, 2, 4, 5, 1, 5))
    println(duplicates)
}

fun findDuplicates(numbers: List<Int>): List<Int> {
    val duplicates = mutableListOf<Int>()
    val allNums = mutableListOf<Int>()

    numbers.forEach { num ->
        if (allNums.contains(num)) {
            duplicates.add(num)
        } else {
            allNums.add(num)
        }
    }
    return duplicates
}

