package com.mglebova

fun main() {

    val messageMaryana = "Hello Alex, My name is Maryann, I'm kotlin programmer!" +
            " I love my little switty black cat"
    println("Maryana message=$messageMaryana")

    val encryptor = Encryptor()

    println("Ecrypting message...")

    val encryptedMessage = encryptor.encrypt(messageMaryana)

    println("Encrypted message=$encryptedMessage")

    println(encryptedMessage)

    println("Send message...")

    println("Message received!\nmessage=$encryptedMessage")

    println("try to decrypt")

    val decryptor = Decryptor()

    val decryptedMessage = decryptor.decrypt(encryptedMessage)

    println("Message decrypted!\nmessage=$decryptedMessage")
}

class Decryptor {
    fun decrypt(message: String) : String {
        val messageChars = message.toList()
        var decryptedMessage = ""
        messageChars.forEach { symbol ->
           decryptedMessage += cryptoDict.filter { it.value == symbol }.keys.first()
        }
        return decryptedMessage
    }

}

class Encryptor {
    fun encrypt(message: String) : String {
        val messageChars = message.toList()
        var encryptedMessage = ""
        messageChars.forEach { symbol ->
            encryptedMessage += cryptoDict.get(symbol)
        }
        return encryptedMessage
    }

}

val cryptoDict = mapOf(
    'a' to '@', 'b' to '&', 'c' to '^', 'd' to '$', 'e' to '#',
    'f' to '*', 'g' to '!', 'h' to '%', 'i' to '~', 'j' to '`',
    'k' to '(', 'l' to ')', 'm' to '-', 'n' to '_', 'o' to '=',
    'p' to '+', 'q' to '[', 'r' to ']', 's' to '{', 't' to '}',
    'u' to '|', 'v' to ';', 'w' to ':', 'x' to '"', 'y' to '<',
    'z' to '>', 'A' to '1', 'B' to '2', 'C' to '3', 'D' to '4',
    'E' to '5', 'F' to '6', 'G' to '7', 'H' to '8', 'I' to '9',
    'J' to '0', 'K' to 'q', 'L' to 'w', 'M' to 'e', 'N' to 'r',
    'O' to 't', 'P' to 'y', 'Q' to 'u', 'R' to 'i', 'S' to 'o',
    'T' to 'p', 'U' to 'a', 'V' to 's', 'W' to 'd', 'X' to 'f',
    'Y' to 'g', 'Z' to 'h', ' ' to ' ', '!' to '§', ',' to ',',
    '\'' to '\''
)