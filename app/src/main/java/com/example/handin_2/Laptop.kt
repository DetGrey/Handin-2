package com.example.handin_2

/*
2. Create a new class called Computer. Before you add any more code, know that you will need to
add two additional classes: Laptop and SmartPhone
For a parent class add 3 properties, 2 methods, and a constructor.
For a child class add at least 1 additional property and 1 additional method.
In the main method create a Laptop and a SmartPhone
 */

class Laptop(state: Boolean, storage: Int, usedStorage: Double, battery: Int): Computer(state, storage, usedStorage) {
    var battery: Int = battery
        set(value) {
            field = if (value < 0) 0
            else if (value > 100) 100
            else value
        }

    fun browseWeb() {
        println("Browsing the web ...")
        battery -= 1
        println("Battery level is now $battery")
    }
}