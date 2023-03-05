package com.test.lec01

import com.lannstark.lec01.Person


fun main() {
    /**
     * - 모든 변수는 var / val 선연 필요
     *  - var : 변경 가능하다 / val : 변경 불가능하다(read-only)
     * - 타입 추론이 가능
     * - primitive / reference 타입의 구분을 해줄 필요 가 없다
     * - nullable은 타입뒤에 ? 추가
     *  - 다른타입으로 간주
     * - 객체를 인스턴스화 할 때 new 불필요
     */


    // 타입 추론 가능, 타입 지정시 : {type} 입력
    // 초기값이 지정되지 않은 경우 타입 명시 필요
    // 모든 변수는 우선 val 로 선언 후 필요에 따라 var 사용하는것을 추천

    // var = variable 변수
    var number1 = 10L
    number1 = 5L
    // val = value 상수
    val number2 = 10L
    //number2 = 5L    // 컴파일 에러

    // 코틀린에서는 primitive 와 reference 타입의 구분이 명확하지 않다.
    // 연산이 발생할 시에는 타입 추론을 해준다.
    var number11 = 10L
    var number3 = 1_000

    // nullable
    var number33: Long?
    number33 = null

    // 객체의 인스턴스
    // new 사용이 불필요.
    var person = Person("name")
}