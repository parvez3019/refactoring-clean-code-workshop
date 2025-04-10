package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @Test
    void convert() {
        ExchangeRateService exchangeRateService = mock(ExchangeRateService.class);
        when(exchangeRateService.getRate("ab","cd")).thenReturn(3.0);
        CurrencyConverter converter = new CurrencyConverter(exchangeRateService);

        double res=converter.convert("ab","cd",3);

        assertEquals(9.0,res,0.01);


    }
}