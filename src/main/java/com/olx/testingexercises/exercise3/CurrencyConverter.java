package com.olx.testingexercises.exercise3;

public class CurrencyConverter {
    private final ExchangeRateService rateService;

    public CurrencyConverter(ExchangeRateService rateService) {
        this.rateService = rateService;
    }

    public double convert(String from, String to, double amount) {
        return amount * rateService.getRate(from, to);
    }
}

/*

Tasks:
- Stub getRate(from, to) for different currencies using when().thenReturn().
- Test conversion logic with valid and invalid inputs.

*/
