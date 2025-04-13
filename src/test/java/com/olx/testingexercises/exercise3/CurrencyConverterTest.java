package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CurrencyConverterTest {

    @Test
    void convert() {
        ExchangeRateService rateService = mock(ExchangeRateService.class);
        when(rateService.getRate("INR", "USD")).thenReturn(0.0);
        CurrencyConverter currencyConverter = new CurrencyConverter(rateService);

        double result = currencyConverter.convert("INR", "USD", 100);
        double expected = 100 * 0.0;

        assertEquals(expected,result);
        verify(rateService, times(1)).getRate("INR", "USD");
    }
}
