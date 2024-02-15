package com.example.handin_2

import java.time.Year

/*
Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
    year
    manufacturerDiscount
    getSalePrice()
If a manufacturerDiscount is set then the salesPrice will be that much cheaper
 */

class Ford(speed: Int, regularPrice: Double, color: String, year: Year): Car(speed, regularPrice, color) {
    var manufacturerDiscount: Int = 0
    override fun getSalePrice(): Double {
        return regularPrice - manufacturerDiscount
    }

}