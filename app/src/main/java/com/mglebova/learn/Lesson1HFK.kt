package com.mglebova.learn

fun main() {
    entertaimentWithMagnets()
}

fun whileLoop() {
    var x = 1
    println("Before the loop. x = $x.")
    while (x < 4) {
        println("In the loop. x = $x.")
        x = x + 1
    }
    println("After the loop. x = $x.")
}

fun ifLoop() {
    val x = 3
    val y = 1
    if (x > y) {
        println("x is greater than y")
    } else {
        println("x is not greater than y")
    }
    println("This line runs no matter what")
}

fun ifLoopExpression() {
    val x = 3
    val y = 1
    println(if (x>y) "x is greater than y" else "x is not greater than y")
    println("This line runs no matter what")
}

// Exercise number 1: entertainment with magnets

fun entertaimentWithMagnets(){
    var x = 1
    while (x < 3){
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x = x + 1
    }
    if (x == 3) print("Do")
}