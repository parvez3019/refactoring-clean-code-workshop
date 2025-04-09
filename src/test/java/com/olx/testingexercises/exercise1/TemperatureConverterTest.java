package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void celsiusToFahrenheit() {
        assertEquals(89.6, converter.celsiusToFahrenheit(32), 0.01);
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(53.33, converter.fahrenheitToCelsius(128), 0.01);

    }
}