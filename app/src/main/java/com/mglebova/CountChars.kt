package com.mglebova


fun main() {
    /**
     *  Реализовать функцию подсчёта количества каждой из букв в строке
     *
     *  fghhdft -> map[d -> 1, f -> 2, h -> 2, g -> 1, t -> 1  ]
     *
     */
    val map = countChars("aabccrrtest")
    println(map)
}


fun countChars(str: String): Map<Char, Int> {

    val map = mutableMapOf<Char, Int>()

    str.forEach { charInStr ->
        val valueOfCharInMap = map.get(charInStr)

        if (valueOfCharInMap == null) {
            map.put(charInStr, 1)
        } else {

            map.put(charInStr, valueOfCharInMap + 1)
        }
    }

    return map
}
