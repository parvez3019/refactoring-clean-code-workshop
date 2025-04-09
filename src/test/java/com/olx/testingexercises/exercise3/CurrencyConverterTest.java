package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @Test
    void convert() {
        double expectedAmount = 0.0;

        CurrencyConverter currencyConverter = new CurrencyConverter(new ExchangeRateService());
        double actualAmount = currencyConverter.convert("INR", "USD", 100);

        assertEquals(expectedAmount, actualAmount);
    }
}