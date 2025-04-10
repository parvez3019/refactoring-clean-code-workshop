package com.olx.testingexercises.exercise1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void shouldConvertNormalTemperatureToFahrenheit() {
        double celsiusTemperature = 32;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        double fahrenheitTemperature = temperatureConverter.celsiusToFahrenheit(celsiusTemperature);

        assertEquals(89.6, fahrenheitTemperature);
    }

    @Test
    public void shouldConvertNormalTemperatureToCelsius() {
        double fahrenheitTemperature = 32;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        double celsiusTemperature = temperatureConverter.fahrenheitToCelsius(fahrenheitTemperature);

        assertEquals(0, celsiusTemperature);
    }

    @Test
    public void shouldConvertNegativeTemperatureToCelsius() {
        double fahrenheitTemperature = -40;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        double celsiusTemperature = temperatureConverter.fahrenheitToCelsius(fahrenheitTemperature);

        assertEquals(-40, celsiusTemperature);
    }

    @Test
    public void shouldConvertNegativeTemperatureToFahrenheit() {
        double celsiusTemperature = -40;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        double fahrenheitTemperature = temperatureConverter.celsiusToFahrenheit(celsiusTemperature);

        assertEquals(-40, fahrenheitTemperature);
    }
}