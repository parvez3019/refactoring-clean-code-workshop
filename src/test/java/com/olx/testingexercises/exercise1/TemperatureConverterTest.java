package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void celciusToFahrenheitFor0Celsius() {
        double temperature = temperatureConverter.celsiusToFahrenheit(0.0);

        assertEquals(32.0, temperature, 0.01);
    }

    @Test
    public void celciusToFahrenheitFor100Celsius() {
        double temperature = temperatureConverter.celsiusToFahrenheit(100.0);

        assertEquals(212.0, temperature, 0.01);
    }

    @Test
    public void celciusToFahrenheitFor37Celsius() {
        double temperature = temperatureConverter.celsiusToFahrenheit(37.0);

        assertEquals(98.6, temperature, 0.01);
    }

    @Test
    public void celciusToFahrenheitForNegativeTemperature() {
        double temperature = temperatureConverter.celsiusToFahrenheit(-50.0);

        assertEquals(-58.0, temperature, 0.01);
    }

    @Test
    public void fahrenheitToCelciusFor32Fahrenheit() {
        double temperature = temperatureConverter.fahrenheitToCelsius(32.0);

        assertEquals(0.0, temperature, 0.01);
    }

    @Test
    public void fahrenheitToCelciusFor212Fahrenheit() {
        double temperature = temperatureConverter.fahrenheitToCelsius(212.0);

        assertEquals(100.0, temperature, 0.01);
    }

    @Test
    public void fahrenheitToCelciusFor99Fahrenheit() {
        double temperature = temperatureConverter.fahrenheitToCelsius(99.0);

        assertEquals(37.22, temperature, 0.01);
    }

    @Test
    public void fahrenheitToCelciusForNegativeFahrenheit() {
        double temperature = temperatureConverter.fahrenheitToCelsius(-58.0);

        assertEquals(-50.0, temperature, 0.01);
    }

    @AfterEach
    void tearDown() {
        temperatureConverter = null;
    }
}