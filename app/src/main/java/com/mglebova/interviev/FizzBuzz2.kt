// Написать программу, которая генерирует последовательность от 1 до N, где:
// числа, кратные 3, заменяются на "Fizz",
//числа, кратные 5 — на "Buzz",
//числа, кратные и 3, и 5 — на "FizzBuzz"..

fun main() {
    val actual = generateFizzBuzz2(15)
    val exptected = listOf(
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    )

    println("actual=$actual")
    println("exptected=$exptected")
}

fun generateFizzBuzz2(n: Int): List<String> {
    val list = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            list.add("FizzBuzz")
        } else if (i % 3 == 0) {
            list.add("Fizz")
        } else if (i % 5 == 0) {
            list.add("Buzz")
        } else list.add("$i")
    }
    return list
}