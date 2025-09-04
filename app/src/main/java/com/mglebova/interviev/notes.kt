fun main() {
    val string = "abva"
    val string2 = "avba"

    val anagramm = anagramm(string, string2)
    println(anagramm)
}


fun anagramm (string1: String, string2: String) : Boolean {
    var reversed = ""
    for(i in string1.length downTo 0){
        reversed += string1[i]
    }
    return reversed == string2
}
