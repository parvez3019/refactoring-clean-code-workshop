package com.olx.testingexercises.exercise1;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
//    @BeforeClass
//    public static void beforeClass() throws Exception {
//
//    }
//    @BeforeAll
//    public static void beforeAll() throws Exception {
//
//    }
    @Test
    public void celsiusToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        int celsius = 32;

        double res=(double)temperatureConverter.celsiusToFahrenheit(celsius);

        assertEquals(89.6, res);

    }

    @Test
    public void fahrenheitToCelsius() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double fahrenheit = 89.6;

        double res=(double)temperatureConverter.fahrenheitToCelsius(fahrenheit);

        assertEquals(32, res);
    }
}