package com.example.activityone

fun main() {
    val num1: Any = 2.1
    val num2: Any = 3.4
    val operation: Char = '+'
    var result = calculate(num1, num2, operation)

    println("$num1 $operation $num2 => $result")
}

fun calculate(num1: Any, num2: Any, operation: Char): Any {
    val a = when (num1) {
        is Int -> num1.toDouble()
        is Double -> num1
        else -> return "The first number is invalid."
    }

    val b = when (num2) {
        is Int -> num2.toDouble()
        is Double -> num2
        else -> return "The second number is invalid."
    }

    return when(operation) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> {if(num2 == 0) "Cannot divide by 0" else  a / b}
        else -> "Invalid operation."
    }
}
