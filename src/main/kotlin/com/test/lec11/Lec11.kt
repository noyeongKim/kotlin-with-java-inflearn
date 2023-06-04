package com.test.lec11

val a = 3

fun add(b: Int) = a+b

open class Cat(i : Int){

}

open class Car(
    val name: String,
    val owner: String,
    _price: Int,
    val cat : Cat
) {
    var price = _price
        private set

}