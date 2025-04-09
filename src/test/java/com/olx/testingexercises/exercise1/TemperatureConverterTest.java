package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter = new TemperatureConverter();
       @Test
    public void testConvertTofahrenheit() {
           assertEquals(89.6,temperatureConverter.celsiusToFahrenheit(32),0.001);
       }
       @Test
    public void testConvertTocelsius() {
           assertEquals(0.0,temperatureConverter.fahrenheitToCelsius(32),0.001);
       }

}