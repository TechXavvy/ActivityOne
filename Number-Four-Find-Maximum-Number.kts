package com.example.activityone

fun main() {
    val sampleList = listOf(33, 18, 57, 12, 99, 101, 98, 2)
    var maxValue = sampleList[0]

    for(num in sampleList) {
        if(num > maxValue) {
            maxValue = num
        }
    }

    println("The largest number in the list $sampleList: $maxValue")
}
