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
    void celsiusToFahrenheit() {
        double celsius1 = 0, celsius2 = 100, celsius3 = -40;

        double fahrenheit1 = converter.celsiusToFahrenheit(celsius1);
        double fahrenheit2 = converter.celsiusToFahrenheit(celsius2);
        double fahrenheit3 = converter.celsiusToFahrenheit(celsius3);

        assertEquals(32, fahrenheit1, 0.01);
        assertEquals(212, fahrenheit2, 0.01);
        assertEquals(-40, fahrenheit3, 0.01);
    }

    @Test
    void fahrenheitToCelsius() {
        double fahrenheit1 = 32, fahrenheit2 = 212, fahrenheit3 = -40;

        double celsius1 = converter.fahrenheitToCelsius(fahrenheit1);
        double celsius2 = converter.fahrenheitToCelsius(fahrenheit2);
        double celsius3 = converter.fahrenheitToCelsius(fahrenheit3);

        assertEquals(0, celsius1, 0.01);
        assertEquals(100, celsius2, 0.01);
        assertEquals(-40, celsius3, 0.01);
    }
}
