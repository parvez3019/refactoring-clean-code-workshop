package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;


class CurrencyConverterTest {

    @Test
    void convert() {

        ExchangeRateService rateService = mock(ExchangeRateService.class);
        when(rateService.getRate("USD", "INR")).thenReturn(82.0);

        CurrencyConverter converter = new CurrencyConverter(rateService);


        double result = converter.convert("USD", "INR", 10);


        assertEquals(820.0, result, 0.001);

    }
}
