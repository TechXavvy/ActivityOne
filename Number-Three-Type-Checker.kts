package com.example.activityone

fun main() {
    val mixedList = listOf("Hello World", 19, true, "Yay", 3.14, 'X')

    for(i in mixedList) {
        when(i) {
            is String -> println("$i is a string bro.")
            is Int -> println("$i is an integer bro.")
            is Boolean -> println("$i is a boolean bro.")
            else -> println("$i is not a string, int, nor boolean bruh.")
        }
    }
}
