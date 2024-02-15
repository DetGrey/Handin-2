package com.example.handin_2

/*
Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
    weight
    getSalePrice()
If the weight of a Truck is more than 2000 kg then there is a discount of 10% otherwise 20%
 */

class Truck(speed: Int, regularPrice: Double, color: String, val weight: Int) : Car(speed, regularPrice, color) {
    override fun getSalePrice(): Double {
        return if (weight > 2000) {
            regularPrice * 0.9
    }
    else {
        regularPrice * 0.8
    }
    }
}