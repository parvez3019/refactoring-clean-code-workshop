package com.olx.testingexercises.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeRateServiceTest {

    @Test
    void getRate() {
        ExchangeRateService exchangeRateService = new ExchangeRateService();

        double rates = exchangeRateService.getRate("2021", "2025");

        assertEquals(0.0, rates, 0.1);
    }

    @Test
    void getRate2() {
        ExchangeRateService exchangeRateService = new ExchangeRateService();

        double rates = exchangeRateService.getRate("2022", "2024");

        assertEquals(0.1, rates, 0.1);
    }
}