package com.olx.movierental;

public class ChildrenPriceCode implements PriceCode {
   @Override
    public double amount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;

        return thisAmount;

    }

    @Override
    public int frequentRentalPoints(int daysRented) {
        return 1;
    }
}
