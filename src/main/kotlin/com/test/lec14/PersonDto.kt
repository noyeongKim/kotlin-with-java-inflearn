package com.test.lec14

fun main() {
    val dto = PersonDto("김노영", 100)
    val dto2 = PersonDto("김노영", 100)

    println(dto == dto2)
}

data class PersonDto(
    val name: String,
    val age: Int,
)
