package com.test.lec07

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException


fun parseInsOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은/는 숫자가 아닙니다.")
    }
}

fun parseInsOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
fun main() {

}