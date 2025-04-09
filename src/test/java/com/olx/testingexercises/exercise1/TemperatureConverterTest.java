package com.olx.testingexercises.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;
public class TemperatureConverterTest {

    @Test
    public void celsiusToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double temperature = temperatureConverter.celsiusToFahrenheit(0.0);
        assertEquals(32, temperature, 0.001);
    }

    @Test
    public void fahrenheitToCelsius() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double temperature = temperatureConverter.fahrenheitToCelsius(32.0);
        assertEquals(0, temperature, 0.001);
    }
}