package com.test.lec13

/**
 * 중첩 클래스
 */
fun main() {

}


/**
 * 중첩 클래스는 일반적으로 static 클래스로 권장하지만,
 *
 * 코틀린의 경우, 중첩 클래스 기본이 static,
 *
 * 내부 클래스 사용시 inner라는 지시어 사용.
 */

class JavaHouse(
    val address: String,
    val livingRoom: LivingRoom
) {

    // inner 클래스 작성
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address
    }
}