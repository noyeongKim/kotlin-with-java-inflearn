package com.test.lec06

fun main() {
    // 전통 for
    val numbers = listOf(1L,2L,3L)

    for(number in numbers) {
        println(number)
    }

    // 등차 수열의 원리로 동작
    // 증가
    for(i in 1..3){
        println(i)
    }

    // 감소
    for(i in 3 downTo 1) {
        println(i)
    }

    // 2씩 증가
    for (i in 1..5 step 2) {
        println(i)
    }

    //while, do while

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }

}