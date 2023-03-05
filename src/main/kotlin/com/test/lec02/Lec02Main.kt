package com.test.lec02

import com.lannstark.lec02.Person
import java.lang.IllegalArgumentException

/**
 * kotlin 에서 null 을 다루는 방법
 *
 * 1. kotlin에서 null 체크
 * 2. safe call과 Elivs 연산자
 */
fun main() {

    /**
     * safe call
     *
     * ?. 로 표시
     *
     * null 이 아니면 실행하고, null 이면 실행하지 않는다.
     *
     *
     */

    val str: String? = null
    println(str?.length)

    /**
     * Elvis 연산자
     *
     * 앞의 연산 결과가 null일 경우 뒤의 값을 사용
     *
     * early return 에서도 사용 할 수 있다.
     */

    val str2: String? = null
    println(str2?.length ?: 0)

    println(startWith("ABC"))

    /**
     * 플랫폼 타입 = 코틀린이 null 관련 정보를 알 수 없는 타입. runtime 오류 발생할 수 있음.
     *
     * java <-> kotlin간 코드 병행시 발생할 수 있는 상황.
     * 단, java에서 null에 대한 정의를 어노테이션으로 명시하면 문제를 해결 할 수 있음.
     *
     * 또는
     */
    val person = Person("null")
    startWithA(person.name)
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")?: throw IllegalArgumentException("str is null")

    /*if (str == null) {
        throw IllegalArgumentException("str is null")
    }

    return str.startsWith("A")*/
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

    /*if (str == null) {
        return null
    }
    return str.startsWith("A")*/
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A")?: false

    /*if (str == null) {
        return false
    }

    return str.startsWith("A")*/
}

fun startWith(str: String?): Boolean {
    /**
     * 절대 null 아님 선언.
     *
     * 단, 정말로 nullable 하지 않다는 전제가 보증되어야 하며,
     * 만약 null이 들어갈 경우 runtime 오류 발생함.
     */
    return str!!.startsWith("A")
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}