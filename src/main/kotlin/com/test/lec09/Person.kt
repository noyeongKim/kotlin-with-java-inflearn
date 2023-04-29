package com.test.lec09

import java.lang.IllegalArgumentException

/**
 * 주 생성자. 반드시 존재
 *
 * 코틀린에서는 기본 생성자 사용을 권장
 *
 * 정적 팩토리 메소드를 추천
 */
class Person(
    val name: String,
    var age: Int
)
{
    /**
     * backing field
     */
//    val name = name
//        get() = field.uppercase()

    val upperCaseName: String
        get() = this.name.uppercase()


    /**
     * getter setter 를 자동으로 생성해준다.
     *
     * constructor 생략가능
     */

    init {
        /**
         * 코틀린 클래스 생성 시점 동작 블록
         */
        if(age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
        }
        println("초기화 블록")
    }

    /**
     * 추가 생성자
     *
     * body를 가질 수 있다
     */
    constructor(
        name: String
    ): this (name, 1) {
        println("부 생성자 1")
    }

    constructor() : this("홍길동") {
        println("부 생성자 2")
    }

    /**
     * 함수 대신 프로퍼티로 만들 수 있다.
     */
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20


}