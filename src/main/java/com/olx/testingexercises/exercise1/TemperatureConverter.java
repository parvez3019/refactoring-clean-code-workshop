package com.olx.testingexercises.exercise1;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

/*
Tasks:
- Write unit tests for both methods with:
- Normal values (0, 100, etc.)
- Edge case: negative temperature
- Assert that values are accurate within 0.01 using assertEquals(expected, actual, delta)
- Use @BeforeEach to reuse the instance of the class.
*/
