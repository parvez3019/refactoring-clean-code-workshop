package com.olx.testingexercises.exercise1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void celsiusToFahrenheit_Test() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double temp= temperatureConverter.celsiusToFahrenheit(5.0);
        assertEquals(41.0, temp, 0.1);
    }

    @Test
    public void fahrenheitToCelsius_Test() {
        //assemble
        TemperatureConverter temperatureConverter=new TemperatureConverter();
        //act
        double temp=temperatureConverter.fahrenheitToCelsius(5.0);
        //assertion
        assertEquals(-15,temp,0.1);
    }
}