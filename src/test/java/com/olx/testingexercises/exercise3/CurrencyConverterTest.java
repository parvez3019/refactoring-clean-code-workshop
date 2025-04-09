package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CurrencyConverterTest {

    private CurrencyConverter converter;
    private ExchangeRateService rateService;

    @BeforeEach
    void setup() {
        rateService = mock(ExchangeRateService.class);
        converter = new CurrencyConverter(rateService);
    }

    @Test
    void testUsdToInrConversion() {
        when(rateService.getRate("USD","INR")).thenReturn(10.0);
        assertEquals(100.0 , converter.convert("USD" , "INR" , 10) , 0);
    }

    @Test
    public void testEurToUsdConversion() {
        when(rateService.getRate("EUR", "USD")).thenReturn(1.1);
        assertEquals(55.0, converter.convert("EUR", "USD", 50), 0.01);
    }

    @Test
    public void testInvalidCurrencyCode() {
        when(rateService.getRate("XXX", "USD")).thenReturn(0.0);
        assertEquals(0.0, converter.convert("XXX", "USD", 100), 0.01);
    }

    @Test
    public void testZeroAmountConversion() {
        when(rateService.getRate("USD", "EUR")).thenReturn(0.85);
        assertEquals(0.0, converter.convert("USD", "EUR", 0), 0.01);
    }
}