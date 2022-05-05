package com.olx.movierental;

import static com.olx.movierental.Rental.DEFAULT_FREQUENT_RENTAL_POINT;

public class RegularPriceCode implements PriceCode {
  @Override
  public double totalAmount(int daysRented) {
    double amount = 0;
    if (daysRented > 2) {
      amount += (daysRented - 2) * 1.5;
    }
    amount += 2;
    return amount;
  }

  @Override
  public int frequentRenterPoints(int daysRented) {
    return DEFAULT_FREQUENT_RENTAL_POINT;
  }
}
