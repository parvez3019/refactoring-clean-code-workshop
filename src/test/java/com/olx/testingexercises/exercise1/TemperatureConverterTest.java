package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;
    @BeforeEach
    void setUp(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    void celsiusToFahrenheit() {
        double result = temperatureConverter.celsiusToFahrenheit(30);
        assertEquals(86.00, result, 0.01);
    }

    @Test
    void fahrenheitToCelsius() {
        double result = temperatureConverter.fahrenheitToCelsius(30);
        assertEquals(-1.11, result, 0.01);
    }

    @AfterEach
    void tearDown(){
        temperatureConverter = null;
    }

}