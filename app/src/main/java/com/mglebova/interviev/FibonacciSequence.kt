package com.mglebova.interviev

//Числа Фибоначчи (Fibonacci Sequence)
//Описание: Написать функцию для генерации N-го числа Фибоначчи или последовательности до N-го числа (итеративно или
//рекурсивно). (Проверяет: циклы/рекурсия, арифметика)
//
//Задание: Напишите метод fun fibonacci(n: Int): Int, который возвращает n-ое число Фибоначчи (последовательность
//начинается с 0, 1, 1, 2...). Реализуйте итеративно.
//
//Пример: fibonacci(0) -> 0, fibonacci(1) -> 1, fibonacci(6) -> 8.

fun main() {
    println(fibonacci(50))
}

fun fibonacci(threshold: Int): List<Int> {
    val listOfNumbers = mutableListOf(0, 1)

    while (listOfNumbers.last() < threshold) {
        val last = listOfNumbers.last()
        val secondToLast = listOfNumbers[listOfNumbers.lastIndex -1]
        val sumOfNumbers = last+secondToLast
        listOfNumbers.add(sumOfNumbers)
    }

    return listOfNumbers
}

