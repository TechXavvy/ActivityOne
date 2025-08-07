package com.example.activityone

fun main() {
    val sampleList = listOf(1, 21, 32, 11, 77, 99)
    val sampleListMaxIndex = sampleList.size - 1
    var reversedList = mutableListOf<Int>()

    for(index in sampleListMaxIndex downTo 0) {
        reversedList.add(sampleList[index])
    }

    println("Original List: $sampleList")
    println("Reversed List: $reversedList")
}
