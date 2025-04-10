package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CurrencyConverterTest {
    private CurrencyConverter currencyConverter;
    private ExchangeRateService mockedRateService;

    @BeforeEach
    public void setUp() {
        mockedRateService = mock(ExchangeRateService.class);
        currencyConverter = new CurrencyConverter(mockedRateService);
    }

    @Test
    public void convertUSDToEUR() {
        when(mockedRateService.getRate("USD", "EUR")).thenReturn(0.9041);

        double resultAmount = currencyConverter.convert("USD","EUR", 10);

        assertEquals(9.0410, resultAmount,0.001);
    }

    @Test
    public void convertINRToEUR() {
        when(mockedRateService.getRate("INR", "EUR")).thenReturn(0.01043);

        double resultAmount = currencyConverter.convert("INR","EUR", 10);

        assertEquals(0.1043,resultAmount,0.001);
    }

    @Test
    public void convertINRToJPY() {
        when(mockedRateService.getRate("INR", "JPY")).thenReturn(1.6714);

        double resultAmount = currencyConverter.convert("INR", "JPY", 10);

        assertEquals(16.714, resultAmount,0.001);
    }

    @Test
    public void convertInNegativeUSDToJPY() {
        when(mockedRateService.getRate("INR", "USD")).thenReturn(144.8546);

        double resultAmount = currencyConverter.convert("INR", "USD", -10);

        assertEquals(-1448.546, resultAmount,0.001);
    }

    @AfterEach
    public void tearDown() {
        currencyConverter = null;
        mockedRateService = null;
    }
}