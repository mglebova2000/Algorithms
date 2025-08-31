package com.mglebova.interviev

fun main() {

    val per = Person()
    Utils.person = per
}

abstract class Animal

class Dog : Sound {
    override fun sound() {
        println("gav")
    }
}

interface Sound {
    fun sound()
}

data class Person (val male: String = "dswef", val weight: Int = 0) {
    private val age = 18
    fun str() : String {
        return ""
    }

    companion object{
        const val a = 24
    }
}

object Utils {

    var person : Person? = null

    fun convert(str:String = "f[f[",str2 : String = "fsesf") : String {
        return ""
    }

}