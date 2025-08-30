//Сумма элементов списка (List Elements)
//Описание: Написать функцию для вычисления суммы всех числовых элементов в списке. (Проверяет: циклы,
//арифметика)
//
//Задание: Напишите метод fun sumElements(numbers: List<Int>): Long, который вычисляет и возвращает сумму всех элементов
//в списке numbers.
//
//Пример: sumElements(listOf(1, 2, 3, 4, 5)) -> 15. sumElements(emptyList()) -> 0.

fun main() {
    val result = sumElements(listOf(1, 2, 3, 4, 5))
    println(result)
}

fun sumElements(numbers: List<Int>): Long{
    var counter : Long = 0

    numbers.forEach { num ->
    counter = counter+num
    }
    return counter
}