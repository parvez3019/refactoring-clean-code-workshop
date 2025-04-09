package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class CurrencyConverterTest {
    private ExchangeRateService mockCurrency;
    private CurrencyConverter converter;

    @BeforeEach
    public void setUp() {
        mockCurrency = mock(ExchangeRateService.class);
        converter = new CurrencyConverter(mockCurrency);
    }

    @Test
    public void testConvert() {
        when(mockCurrency.getRate("USD","INR")).thenReturn(85.0);
        double rate = converter.convert("USD", "INR", 100);
        assertEquals(8500.0,rate,0.001);
        
    }
}