package com.example.activityone

fun main() {
    val numbers = (1..20).toList()
    val filteredNum = numbers.filter {it % 2 == 0}
    val transformedNum = filteredNum.map {it * 2}

    println("Original List: $numbers")
    println("Transformed List: $transformedNum")
}
