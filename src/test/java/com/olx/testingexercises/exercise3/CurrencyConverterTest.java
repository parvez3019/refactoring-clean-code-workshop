package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CurrencyConverterTest {

    public ExchangeRateService rateService;
    public CurrencyConverter currencyConverter;

    @BeforeEach
    void setUp() {
        rateService = mock(ExchangeRateService.class);
        currencyConverter = new CurrencyConverter(rateService);
    }
    @Test
    public void convertUSDToINR() {
        //stub
        when(rateService.getRate("USD", "INR")).thenReturn(85.0);

        double result = currencyConverter.convert("USD", "INR", 2);

        assertEquals(170, result, 0.1);
    }

    @Test
    public void convertUnkonwnCurrency() {
        when(rateService.getRate("ABC", "XYZ")).thenReturn(0.0);

        double result = currencyConverter.convert("ABC", "XYZ", 2);

        assertEquals(0.0, result, 0.1);
    }

}