package com.example.handin_2

/*
Create a super class called Car. The Car class has the following fields and methods.
    speed
    regularPrice
    color
    getSalePrice()
 */

open class Car(val speed: Int, val regularPrice: Double, val color: String) {
    open fun getSalePrice(): Double {
        return regularPrice
    }
}