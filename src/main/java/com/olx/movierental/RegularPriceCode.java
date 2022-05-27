package com.olx.movierental;

public class RegularPriceCode implements PriceCode {
    @Override
    public double amount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;

        return thisAmount;
    }

    @Override
    public int frequentRentalPoints(int daysRented) {
        return 1;
    }
}
