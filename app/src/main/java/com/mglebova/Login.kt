
fun main() {

    val actual1 = login("Alex","SSSMKIK")
    val expected1 = false
    println("actual1=$actual1 expected1=$expected1")

    val actual2 = login("Alex","Real1234PASW")
    val expected2 = true
    println("actual2=$actual2 expected2=$expected2")

}

/**
 * return Boolean to verify if user is registered
 */
fun login(login : String, password : String) : Boolean {
    if (login == "Alex" && password == "Real1234PASW"){
        return true
    } else return false
}