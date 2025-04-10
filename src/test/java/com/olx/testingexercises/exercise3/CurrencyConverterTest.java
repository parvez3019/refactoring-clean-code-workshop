package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CurrencyConverterTest {

    ExchangeRateService mockExchangeRateService;
    CurrencyConverter currencyConverter;

    @BeforeEach
    void setUp() {
        mockExchangeRateService = mock(ExchangeRateService.class);
        currencyConverter = new CurrencyConverter(mockExchangeRateService);
    }

    @Test
    void convert() {
        when(mockExchangeRateService.getRate("INR", "USD")).thenReturn(0.0);
        double result = currencyConverter.convert("USD", "INR", 100.0);
        assertEquals(0.0,result,0.01);
    }

    @Test
    public void testConvertWithInvalidCurrencyPair() {
        when(mockExchangeRateService.getRate("USD", "INR")).thenReturn(83.0);
        double result = currencyConverter.convert("USD", "INR", 100.0);
        assertEquals(83.0,result,0.01);
    }
}