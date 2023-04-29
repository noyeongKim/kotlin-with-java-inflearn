package com.test.lec08

fun main() {
    // named argument 어떤 매개변수를 사용할지 명시
    repeat(
        str = "hello world",
        useNewLine = false
    )

    printAll("A", "B", "C")

    val array = arrayOf("a", "b", "c")
    printAll(*array)
}

/**
 * 함수의 결과 값이 하나 이면 = 로 접근 가능 (표현식도 1개일 경우)
 *
 * arrow 는 사용이 안되넹..
 */
fun max(a: Int, b: Int) = if(a > b)  a  else  b

/**
 * 기본 값 지정과 named argument 를 사용해서, overloading 처럼 사용 가능
 */
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}