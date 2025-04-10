package com.olx.testingexercises.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TemperatureConverterTest {

    @Test
    public void celsiusToFahrenheit() {
        TemperatureConverter convert=new TemperatureConverter();
        double result=convert.celsiusToFahrenheit(5);

        assertEquals(41,result,0.01);
    }

    @Test
    public void fahrenheitToCelsius() {
        TemperatureConverter convert=new TemperatureConverter();

        assertEquals(5,convert.fahrenheitToCelsius(41),0.01);
    }
}