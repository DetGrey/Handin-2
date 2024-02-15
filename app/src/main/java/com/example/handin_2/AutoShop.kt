package com.example.handin_2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Year

/*
Create AutoShop class which contains the main() method.
Perform the following within the main() method.

Create an instance of Truck class and initialize all the fields with appropriate values.
Use super(...) method in the constructor for initializing the fields of the superclass.

Create two instances of the Ford class and initialize all the fields with appropriate values.
Use super(...) method in the constructor for initializing the fields of the super class.

Create an instance of Car class and initialize all the fields with appropriate values.
Display the sale prices of all instances.
 */

class AutoShop {
    @RequiresApi(Build.VERSION_CODES.O)
    fun main() {
        val truck = Truck(80,40000.0,"Blue",2500)

        val ford1 = Ford(100, 30000.0, "Red", Year.parse("2022"))
        ford1.manufacturerDiscount = 2000
        val ford2 = Ford(90, 28000.0, "Silver", Year.parse("2023"))

        val car = Car(70, 25000.0, "Black")

        println("Truck Sale Price: $${truck.getSalePrice()}")
        println("Ford1 Sale Price: $${ford1.getSalePrice()}")
        println("Ford2 Sale Price: $${ford2.getSalePrice()}")
        println("Car Sale Price: $${car.getSalePrice()}")
    }
}

/*
Autoshop - optional
Car
Create a super class called Car. The Car class has the following fields and methods.
    speed
    regularPrice
    color
    getSalePrice()
    Truck
Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
    weight
    getSalePrice()
If the weight of a Truck is more than 2000 kg then there is a discount of 10% otherwise 20%
    Ford
Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods year
    manufacturerDiscount
    getSalePrice()
If a manufacturerDiscount is set then the salesPrice will be that much cheaper
AutoShop
Create AutoShop class which contains the main() method. Perform the following within the main() method.
Create an instance of Truck class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the super class.
Create an instance of Car class and initialize all the fields with appropriate values. Display the sale prices of all instances.
 */