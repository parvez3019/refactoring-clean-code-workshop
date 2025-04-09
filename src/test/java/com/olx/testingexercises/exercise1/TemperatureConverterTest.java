package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(98.6, converter.celsiusToFahrenheit(37.0), 0.1);
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.1);

    }

    @Test
    void fahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.1);
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.1);
    }
}