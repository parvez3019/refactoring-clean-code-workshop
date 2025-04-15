package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TemperatureConverterTest {

    @Test
    public void shouldSuccessfullyConvertToFahrenheit() {
        //Arrange
        double tempInCelsius = 37;
        TemperatureConverter converter = new TemperatureConverter();

        //Act
        double convertedToFahrenheit = converter.celsiusToFahrenheit(tempInCelsius);

        //Assert
        assertEquals(98.6, convertedToFahrenheit, 0.001);

    }

    @Test
    public void shouldSuccessfullyConvertToCelsius() {
        //Arrange
        double tempInFahrenheit = 37;
        TemperatureConverter converter = new TemperatureConverter();

        //Act
        double convertedToCelsius = converter.fahrenheitToCelsius(tempInFahrenheit);

        //Assert
        assertEquals(2.777, convertedToCelsius, 0.001);
    }
}