package com.test.lec03

import com.lannstark.lec03.Person


/**
 * 1. 기본타입
 *      - 타입 추론가능
 *      - 기본 타입간 변경은 명시적으로 표현해줘야 한다. to{type}() 함수를 사용하여 형변환
 *      - nullable 처리 필수!
 * 2. 타입 캐스팅
 *      - is : java 의 instanceof 타입 추론, 앞에 !붙이면 not의 의미가 된다.
 *      - as : java 의 object casting -> (SomObject) 형식으로 사용하던 것. 뒤에 ?를 붙여서 safe call로 null 처리 가능
 *      - 스마트 캐스트 : 조건문에서 타입 추론이 된다면, as를 사용하지 않고도 해당 object를 타입에 맞춰 사용 가능
 * 3. Kotlin 의 3가지의 특이한 타입
 *      - Any : java의 Object 개념. 모든 객체의 최상위 타입. ?로 null 표현. equals, hashCode, toString 이 존재
 *      - Unit : java의 void와 동일한 역할. void와 다르게 Unit은 그 자체로 타입인자로써 사용 가능. 함수형 프로그램에서 하나의 instance를 표현하기 위해 사용.
 *      - Nothing : 함수가 정상적으로 끝나지 않았다는 사실을 표현. 무조건 예외를 반환하는 함수나 무한루프 함수등에서 사용(실제 코드에서는 많이 사용되지 않음)???
 * 4. String Interpolation, String indexing
 *
 */
fun main() {

    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0
    val number3 = 3
    val number4 = 5

    val person = Person("김노영", 100)
    println("이름 ${person.name}, 나이 ${person.age}")

    // 문자열 행간 추가
    val str = """
        abcd
        dddd
        aeqqer
        ddadf
    """.trimIndent()
    println(str)

    // indexAt
    val str2 = "abc"
    println(str2[0])
    println(str2[str2.lastIndex])
}

fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        val person = obj as? Person
        println(person?.age)
    }
}


