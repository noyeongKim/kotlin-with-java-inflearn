package com.test.lec12

import com.lannstark.lec12.Movable

fun main(){
    Singleton.a

    moveSomeThing(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    companion object Factory: Log {
        // const를 붙이면 컴파일시에 변수가 할당된다.
        private const val MIN_AGE = 0

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("person companion object")
        }
    }
}

/**
 * 싱글톤 구현
 */
object Singleton {
    var a: Int = 0
}

private fun moveSomeThing(movable: Movable) {
    movable.move()
    movable.fly()
}