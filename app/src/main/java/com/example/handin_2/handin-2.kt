package com.example.handin_2

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    // Exercise 1
    // Create two Employee objects and display each object’s yearly salary.
    // Then give each Employee a 10% raise and display each Employee’s yearly salary again.

    val employee1 = Employee("John", "Doe", 5000.0)
    val employee2 = Employee("Jane", "Doe", 6000.0)

    println("${employee1.firstName} ${employee1.lastName} has a yearly salary of ${employee1.monthlySalary * 12}")
    println("${employee2.firstName} ${employee2.lastName} has a yearly salary of ${employee2.yearlySalary}")
    println()

    employee1.giveRaise(10)
    employee2.giveRaise(10)
    println()

    println("${employee1.firstName} ${employee1.lastName} now has a yearly salary of ${employee1.monthlySalary * 12}")
    println("${employee2.firstName} ${employee2.lastName} now has a yearly salary of ${employee2.yearlySalary}")
    println()
    println()

    // Exercise 2
    // In the main method create a Laptop and a SmartPhone

    val laptop = Laptop(true, 128, 65.7, 99)
    laptop.browseWeb()
    println()

    val phone = SmartPhone(true, 128, 65.7, 54)
    phone.toggleVolume(51)
    println()
    println()

    // Exercise 3
    val shoe = Shoe(399.95, 2)
    shoe.identifyProductCategory()
    val tShirt = Tshirt(199.95, 4)
    tShirt.identifyProductCategory()
    val book = Book(99.95, 1)
    book.identifyProductCategory()
    println()
    println()


    // Exercise 4
    val circle = Circle(4.0, "white", false)
    println("The circle has a perimeter of ${circle.calculatePerimeter()} and an area of ${circle.calculateArea()}")

    val rectangle = Rectangle(5.0, 2.0, "white", false)
    println("The rectangle has a perimeter of ${rectangle.calculatePerimeter()} and an area of ${rectangle.calculateArea()}")

    val triangle = Triangle(4.0, 2.0, 3.0, 4.0, "white", false)
    println("The triangle has a perimeter of ${triangle.calculatePerimeter()} and an area of ${triangle.calculateArea()}")
    println()
    println()

    // Autoshop - optional
    val autoShop = AutoShop()
    autoShop.main()
}
