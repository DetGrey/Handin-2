package com.example.handin_2

/*
2. Create a new class called Computer. Before you add any more code, know that you will need to
add two additional classes: Laptop and SmartPhone
For a parent class add 3 properties, 2 methods, and a constructor.
For a child class add at least 1 additional property and 1 additional method.
In the main method create a Laptop and a SmartPhone
 */

open class Computer(var state: Boolean, val storage: Int, usedStorage: Double) {
    var usedStorage: Double = usedStorage
        set(value) {
            field = if (value <= storage && value >= 0.0) value else 0.0
        }

    fun toggleState() {
        state = !state
        val power = if (state) "on" else "off"
        println("Power is now $power")
    }

    private fun checkAvailableStorage() {
        val availableStorage: Double = storage - usedStorage
        println("Computer has $availableStorage storage left")
    }

}