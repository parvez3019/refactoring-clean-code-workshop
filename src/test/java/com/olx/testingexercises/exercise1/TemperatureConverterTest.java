package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void celsiusToFahrenheitZeroCheck() {
        double celsius = 0;

        double fahrenheit = converter.celsiusToFahrenheit(celsius);

        assertEquals(32, fahrenheit, 0.01);
    }

    @Test
    void celsiusToFahrenheitPositiveCheck() {
        double celsius = 100;

        double fahrenheit = converter.celsiusToFahrenheit(celsius);

        assertEquals(212, fahrenheit, 0.01);
    }

    @Test
    void celsiusToFahrenheitNegativeCheck() {
        double celsius = -40;

        double fahrenheit = converter.celsiusToFahrenheit(celsius);

        assertEquals(-40, fahrenheit, 0.01);
    }

    @Test
    void fahrenheitToCelsiusZeroCheck() {
        double fahrenheit = 32;

        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(0, celsius, 0.01);
    }

    @Test
    void fahrenheitToCelsiusPositiveCheck() {
        double fahrenheit = 212;

        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(100, celsius, 0.01);
    }

    @Test
    void fahrenheitToCelsiusNegativeCheck() {
        double fahrenheit = -40;

        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(-40, celsius, 0.01);
    }
}