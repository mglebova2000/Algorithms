//Удалить дубликаты из списка (Remove Duplicates from List)
//Описание: Написать функцию, которая принимает список и возвращает новый список без дубликатов. (Проверяет: работа
//с коллекциями, Set, циклы)
//
//Задание: Напишите метод fun removeDuplicates(list: List<String>): List<String>, который принимает список строк и
//возвращает новый список, содержащий только уникальные строки из исходного списка, сохраняя порядок первого
//вхождения.
//
//Пример: removeDuplicates(listOf("a", "b", "a", "c", "b")) -> ["a", "b", "c"].

fun main() {
    val result = removeDuplicates(listOf("a", "b", "a", "c", "b"))
    println(result)
}

fun removeDuplicates(list: List<String>): List<String>{
    return list.toSet().toList()
}
