package com.example.activityone

fun main() {
    val givenGrades = listOf(85, 42, 70, 58, 90)
    var gradeMark = ""

    for(grade in givenGrades) {
        if(grade < 60) {
            gradeMark = "Fail"
        }
        else {
            gradeMark = "Pass"
        }

        println("Grade: $grade, Mark: $gradeMark")
    }
}
