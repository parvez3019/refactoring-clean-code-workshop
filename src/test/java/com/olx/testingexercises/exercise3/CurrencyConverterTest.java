package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CurrencyConverterTest {
    public CurrencyConverter converter;

    @BeforeEach
    public void setUp() {
        ExchangeRateService exchangeRateService = mock(ExchangeRateService.class);
        when(exchangeRateService.getRate(any(), any())).thenReturn(1.0);
        converter = new CurrencyConverter(exchangeRateService);
    }

    @Test
    public void convertCurrencyToCelsius() {
        assertEquals(1000, converter.convert("USD", "INR", 1000), 0.1);
    }

  
}