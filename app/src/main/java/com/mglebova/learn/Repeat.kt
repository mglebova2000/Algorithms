fun main() {
    val capitals = mapOf("Italy" to "Rome", "Canada" to "Ottawa")

    val el = capitals["Spain"]

    val length = el?.length ?: -2

    println(length)



}

