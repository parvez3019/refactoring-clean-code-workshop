package com.olx.testingexercises.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void celsiusToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double value = temperatureConverter.celsiusToFahrenheit(5.0);
        assertEquals(41.0, value, 0.1);
    }

    @Test
    public void fahrenheitToCelsius() {
    }
}