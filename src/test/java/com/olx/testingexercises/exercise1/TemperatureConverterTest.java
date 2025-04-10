package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit() {
//      AAA
        double celsius = 40;

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double fahrenheit = temperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(104, fahrenheit);
    }

    @Test
    void fahrenheitToCelsius() {

        double fahrenheit = 100;

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double celsius = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals( 37.77, celsius,0.01);
    }
}