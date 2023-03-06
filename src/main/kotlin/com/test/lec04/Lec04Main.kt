package com.test.lec04

import com.lannstark.lec04.JavaMoney

/**
 * 1. 단항 연산자. 산술 연산자 = 자바와 동일
 *      ++ --
 *      + - * / %
 *
 * 2. 비교연산자와 동등성, 동일성
 *      동등성(equality) : 두 객체의 값이 같은가? java : equals / kotlin : ==
 *      동일성(identity) : 완전히 동일한 객체인가? 참조 주소가 같은가? java : == / kotlin : ===
 *
 * 3. 논리연산자 / 코틀린에 있는 특이 연산자
 *      lazy 연산 : 조건문에서 선행되는 조건이 참일 경우 이후의 조건은 실행되지 않는 것.
 *      in / !in : 컬렉션 또는 범위 배열에 포함되어 있다(in), 포함되어 있지 않다(!in)
 *      a..b : a 부터 b 까지 범위 객체 생성
 *      a[i] : a 범위 객체의 i  번째 값
 *      a[i] = b : a 범위 객체의 i번째 값을 b로 입력
 *
 * 4. 연산자 오버로딩
 *      코틀린에서는 객체마다 연산자를 정의할 수 있다. (함수를 operator 로 선언!)
 *      https://www.google.com/search?q=kotlin+operator+fun&oq=kotlin+oper&aqs=chrome.1.0i512l3j69i57j0i512l6.4658j0j15&sourceid=chrome&ie=UTF-8
 */
fun main() {

    val money1 = JavaMoney(1000)
    val money2 = money1
    val money3 = JavaMoney(1000)

    /**
     * java와는 다르게 비교 연산자를 사용하면 자동으로 compareTo 함수를 호출하여 비교
     */
    if(money1 > money2) {
        println("money1 이 money2 보다 큽니다")
    }

    println(money1 === money3)

}