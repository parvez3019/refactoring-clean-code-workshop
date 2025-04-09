package com.olx.testingexercises.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {

        // Arrange
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double fahrenheit = temperatureConverter.celsiusToFahrenheit(30);

        // Assert
        assertEquals(86.0 , fahrenheit, 0);


    }

    @Test
    public void testFahrenheitToCelsius() {
        // Arrange
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double celsius = temperatureConverter.fahrenheitToCelsius(68);

        // Assert
        assertEquals(20.0 , celsius,0);
    }
}