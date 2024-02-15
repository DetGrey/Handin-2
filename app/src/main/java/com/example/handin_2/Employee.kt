package com.example.handin_2

/*
1. Create a class called Employee that includes three pieces of information as instance variables
    A first name
    A last name
    A monthly salary
Your class should have a constructor that initializes the three instance variables.
If the monthly salary is not positive, set it to 0.0.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

class Employee(val firstName: String, val lastName: String, monthlySalary: Double) {
    var monthlySalary: Double = monthlySalary
        set(value) {
            field = if (value > 0) value else 0.0
        }
    val yearlySalary
        get() = monthlySalary * 12

    fun giveRaise(percentage: Int) {
        println("Employee $firstName $lastName has been given a $percentage% raise")
        monthlySalary += monthlySalary / 100 * percentage
    }
}