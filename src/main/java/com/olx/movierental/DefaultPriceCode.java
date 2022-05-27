package com.olx.movierental;

public class DefaultPriceCode implements PriceCode {
    @Override
    public double amount(int daysRented) {
        return 0;
    }

    @Override
    public int frequentRentalPoints(int daysRented) {
        return 0;
    }
}
