package com.mglebova

fun main() {


    val list: List<String> = listOf(
        "dfsesefaafddsfa",
        "fsefse",
        "sfsfeaaaaaaa",
        "fesikfhjshfsuhaaaaaaaaaaaaaaaaaaaaaaa"
    )


    val index = maxIndexWithAChar(list)

    println(index)

}

fun maxIndexWithAChar(list: List<String>): Int {

    //storage for indexes and count of a
    val map = mutableMapOf<Int, Int>()

    // для каждого элемента списка считает кол-во символов а и сохраняет их в мапу
    list.forEachIndexed { index, strokaVSpiske ->
        val aCount = calculateAChars(strokaVSpiske)
        map.put(index, aCount)
    }

    val maxIndex = indexOfMaxValueOfMap(map)

    return maxIndex
}

fun indexOfMaxValueOfMap(map: Map<Int, Int>): Int {

    var indexOfMaxValue = -1
    var maxValue = -1

    map.forEach{
        val index = it.key
        val aCount = it.value

        if (aCount>maxValue) {
            indexOfMaxValue = index
            maxValue = aCount
        }

    }
    return indexOfMaxValue
}

fun calculateAChars(stroka: String): Int {
    val chars = stroka.toList()
    var counter = 0

    chars.forEach {
        if (it == 'a') {
            counter += 1
        }

    }
    return counter


}