package com.test.lec15

fun main() {

    val array = arrayOf(100, 200)

    for(i in array.indices) {
        println("$i ${array[i]}")
    }

    array.plus(300)

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // mutable collection :: 컬렉션에 element를 추가 할 수 있다.
    // immutable collection :: 컬렉션에 element 추가 불가. 단 컬렉션 내의 element 의 reference type은 바꿀 수 있다.


    // list
    val numbers = mutableListOf(100, 200)
    val emptyList = emptyList<Int>()


    println(numbers[0])

    for (number in numbers) {
        println("$number")
    }

    for ((idx, value) in numbers.withIndex()){
        println("$idx $value")
    }

    // set
    // list와 비슷하게 동작

    mutableSetOf(100)

    // map

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "monday", 2 to "tuesday")

    for (key in oldMap.keys) {
        println(key)

    }

    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }


}