package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CurrencyConverterTest {
    @Test
    public void getRate() {
        ExchangeRateService mockRateService = mock(ExchangeRateService.class);
        when(mockRateService.getRate("USD", "EUR")).thenReturn(0.85);

        CurrencyConverter converter = new CurrencyConverter(mockRateService);
        double result = converter.convert("USD", "EUR", 100);

        assertEquals(85.0, result, 0.001);
    }

}