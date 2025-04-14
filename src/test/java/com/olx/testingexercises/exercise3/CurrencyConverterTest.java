package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CurrencyConverterTest {

    private ExchangeRateService rateService;
    private CurrencyConverter converter;

    @BeforeEach
    void setUp() {
        rateService = mock(ExchangeRateService.class);
        converter = new CurrencyConverter(rateService);
    }

    @Test
    void testUSDToEURConversion() {
        when(rateService.getRate("USD", "EUR")).thenReturn(0.85);

        double result = converter.convert("USD", "EUR", 100);
        assertEquals(85.0, result, 0.001);
    }

    @Test
    void testINRToUSDConversion() {
        when(rateService.getRate("INR", "USD")).thenReturn(0.012);

        double result = converter.convert("INR", "USD", 1000);
        assertEquals(12.0, result, 0.001);
    }

    @Test
    void testSameCurrencyConversion() {
        when(rateService.getRate("JPY", "JPY")).thenReturn(1.0);

        double result = converter.convert("JPY", "JPY", 500);
        assertEquals(500.0, result, 0.001);
    }

    @Test
    void testUnknownCurrencyConversion() {
        when(rateService.getRate("XXX", "YYY")).thenReturn(0.0);

        double result = converter.convert("XXX", "YYY", 100);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testNegativeAmountConversion() {
        when(rateService.getRate("USD", "EUR")).thenReturn(0.85);

        double result = converter.convert("USD", "EUR", -100);
        assertEquals(-85.0, result, 0.001);
    }
}
