package com.olx.testing.lesson2;

//Lesson 2: More Assertions
//Concept: Different assertion methods like assertTrue, assertFalse, assertNotNull, assertThrows.

public class StringExample {
    public static int number = 0;

    public String reverse(String input) {
        if (input == null) throw new InvalidStringException("Input cannot be null");
        return new StringBuilder(input).reverse().toString();
    }

}


