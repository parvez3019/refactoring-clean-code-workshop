package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {
    @Test
    public void shouldConvertToUSD() {
        ExchangeRateService mockExchangeRateService = mock(ExchangeRateService.class);

        when(mockExchangeRateService.getRate("INR", "USD")).thenReturn(12.00);

        CurrencyConverter converter = new CurrencyConverter(mockExchangeRateService);
        double result = converter.convert("INR", "USD", 100);
        assertEquals(12 * 100, result, 0.01);
    }

}