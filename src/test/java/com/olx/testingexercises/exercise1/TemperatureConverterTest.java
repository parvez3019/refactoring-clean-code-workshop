package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    TemperatureConverter temperatureConverter = new TemperatureConverter();
       @Test
    public void testConvertTofahrenheit() {
           assertEquals(89.6,temperatureConverter.celsiusToFahrenheit(32),0.001);
       }

}