package com.olx.testing.lesson2;

//Lesson 2: More Assertions
//Concept: Different assertion methods like assertTrue, assertFalse, assertNotNull, assertThrows.

public class StringExample {
    public String reverse(String input) {
        if (input == null) throw new IllegalArgumentException("Input cannot be null");
        return new StringBuilder(input).reverse().toString();
    }

}


