package com.test.lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar("아반뗴", 1000L)
class Sonate : HyundaiCar("쏘나타", 2000L)
class Granduer : HyundaiCar("그랜져", 3000L)