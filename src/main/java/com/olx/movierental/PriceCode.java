package com.olx.movierental;

public interface PriceCode {
    double amount(int daysRented);

    int frequentRentalPoints(int daysRented);

}
