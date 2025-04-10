package com.olx.testingexercises.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CurrencyConverterTest {

    @Test
    public void convert() {
        ExchangeRateService mockRateService= mock(ExchangeRateService.class);

        when(mockRateService.getRate("USD", "INR")).thenReturn(82.0);
        CurrencyConverter converter = new CurrencyConverter(mockRateService);

        double result = converter.convert("USD", "INR", 10.0);

        assertEquals(820.0, result);
    }
    @Test
    public void convert1() {
        ExchangeRateService mockRateService= mock(ExchangeRateService.class);

        when(mockRateService.getRate("USD", "")).thenReturn(7.0);
        CurrencyConverter converter = new CurrencyConverter(mockRateService);

        double result = converter.convert("USD", "INR", 10.0);

        assertEquals(70.0, result);
    }
}