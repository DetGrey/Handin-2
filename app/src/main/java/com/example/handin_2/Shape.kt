package com.example.handin_2

/*
4. Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape.
Every shape has two attributes
    color
    isTransparent
Furthermore every class has private attributes to calculate perimeter and area for each shape.
E.g. a Rectangle has the attributes: height, width, color & isTransparent
The attributes are set in the constructor
The 3 classes all overrides the following abstract methods from their parent class:
    calculatePerimeter
    calculateArea
The functions will return the perimeter or area of the shape.
 */

abstract class Shape(var color: String, var isTransparent: Boolean) {

    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}