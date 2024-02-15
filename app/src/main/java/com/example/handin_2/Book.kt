package com.example.handin_2

/*
3. Create a base class Product with attributes like name, price, and quantity and a
function identifyProductCategory. Subclass it to create specific product types like Shoe,
T-shirt, and Book. Override the function such that:
    The shoe outputs "I am a shoe" .
    The T-shirt outputs "I am a T-shirt"
    The book outputs "I am a book"
 */

class Book(price: Double, quantity: Int): Product("book", price, quantity) {
    override fun identifyProductCategory() {
        println("I am a book")
    }
}