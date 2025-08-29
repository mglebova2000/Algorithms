//Проверка на простое число (Prime Number Check)
//Описание: Написать функцию, которая определяет, является ли данное число простым. (Проверяет: циклы, условия,
//оптимизация)
//
//Задание: Напишите метод fun isPrime(number: Int): Boolean, который возвращает true, если number (положительное
//целое число > 1) является простым, и false иначе.
//
//Пример: isPrime(7) -> true, isPrime(10) -> false, isPrime(2) -> true.

fun main() {
    val isPrimeNumber = isPrime(1001)
    println(isPrimeNumber)
}

fun isPrime(number: Int): Boolean {
    for (i in 2..number - 1) {
        if (number % i == 0)
            return false
    }
    return true
}