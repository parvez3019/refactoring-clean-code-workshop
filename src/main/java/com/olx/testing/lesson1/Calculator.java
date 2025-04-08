package com.olx.testing.lesson1;

//Lesson 1: Introduction to Unit Testing & JUnit
//Concept: What is unit testing? Why do we write them? Introduction to JUnit annotations.

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
