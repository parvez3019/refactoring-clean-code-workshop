package com.olx.movierental;

public class BluerayPriceCode implements PriceCode {
    @Override
    public double amount(int daysRented) {
        return 4 * daysRented;
    }

    @Override
    public int frequentRentalPoints(int daysRented) {
        return 3;
    }
}
