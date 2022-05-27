package com.olx.movierental;

public class NewReleasePriceCode implements PriceCode {

    @Override
    public double amount(int daysRented) {

        return daysRented * 3;
    }

    @Override
    public int frequentRentalPoints(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
