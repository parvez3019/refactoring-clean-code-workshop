package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeRateServiceTest {

    @Test
    void getRate() {
        double actualRate = 0.0;

        ExchangeRateService exchangeRateService = new ExchangeRateService();
        double expectedRate =  exchangeRateService.getRate("INR", "USD");

        assertEquals(actualRate, expectedRate);
    }
}