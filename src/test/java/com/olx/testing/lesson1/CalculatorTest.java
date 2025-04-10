package com.olx.testing.lesson1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldSuccessfullyAddTwoPositiveNumber() {
        // Arrange
        int number1 = 2;
        int number2 = 3;
        Calculator calculator = new Calculator();

        // Act
        int addedResult = calculator.add(number1, number2);

        // Assert
        assertEquals(5, addedResult);
    }
}