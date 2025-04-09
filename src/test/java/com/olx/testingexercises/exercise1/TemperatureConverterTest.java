package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void testCelsiusToFahrenheit_PositiveAndZeroInput() {
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0), 0);
        assertEquals(212.0, temperatureConverter.celsiusToFahrenheit(100), 0);
        assertEquals(98.6, temperatureConverter.celsiusToFahrenheit(37), 0);
    }

    @Test
    public void testCelsiusToFahrenheit_NegativeInput() {
        assertEquals(-40.0, temperatureConverter.celsiusToFahrenheit(-40), 0);
    }

    @Test
    public void testFahrenheitToCelsius_PositiveAndZeroInput() {
        assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(32), 0);
        assertEquals(-17.77777777777778, temperatureConverter.fahrenheitToCelsius(0), 0);
        assertEquals(100.0, temperatureConverter.fahrenheitToCelsius(212), 0);
    }

    @Test
    public void testFahrenheitToCelsius_NegativeInput() {
        assertEquals(-40.0, temperatureConverter.fahrenheitToCelsius(-40), 0);
    }

}