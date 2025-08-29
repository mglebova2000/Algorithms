//Найти максимальный/минимальный элемент в массиве/списке (Find Max/Min in Array/List)
//Описание: Написать функцию для поиска наибольшего или наименьшего числа в массиве/списке без использования
//встроенных функций max/min коллекций (иногда просят). (Проверяет: циклы, сравнения)
//
//Задание: Напишите метод fun findMax(numbers: IntArray): Int, который находит и возвращает максимальное значение в
//массиве numbers без использования встроенных функций максимума. Обработайте случай пустого массива (
//например, выбросив исключение или вернув Int.MIN_VALUE).
//
//Пример: findMax(intArrayOf(1, 5, 2, 9, 3)) -> 9. findMax(intArrayOf(-1, -5, -2)) -> -1.

fun main() {
    val find = findMax(listOf(1, 5, 2, 9, 3))
    val find2 = findMax(listOf(-1, -5, -2))
    println(find)
    println(find2)
}

fun findMax(list: List<Int>) : Int {
    var maxValue = Int.MIN_VALUE

    list.forEach { num ->
    if (num > maxValue){
        maxValue = num
    }
    }
    return maxValue
}