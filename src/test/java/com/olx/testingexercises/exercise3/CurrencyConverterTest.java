package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CurrencyConverterTest {

    @Test
    void convertFromUSDToINR() {
        ExchangeRateService mockRateService = mock(ExchangeRateService.class);
        CurrencyConverter converter = new CurrencyConverter(mockRateService);
        when(mockRateService.getRate("USD", "INR")).thenReturn(0.10);

        double calculatedValue = converter.convert("USD", "INR", 100);

        assertEquals(10.0, calculatedValue);
        verify(mockRateService, times(1)).getRate("USD", "INR");
    }
}