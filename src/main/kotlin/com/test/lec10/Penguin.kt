package com.test.lec10

class Penguin(
    species: String
): Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("팽귄이 움직인다")
    }

    /**
     * 추상 클래스 상속
     */
    override val legCount: Int
        get() = super.legCount + this.wingCount

    /**
     * 인터페이스 상속
     */
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimability: Int
        get() = TODO("Not yet implemented")
}