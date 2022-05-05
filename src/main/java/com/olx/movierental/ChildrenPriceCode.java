package com.olx.movierental;

import static com.olx.movierental.Rental.DEFAULT_FREQUENT_RENTAL_POINT;

public class ChildrenPriceCode implements PriceCode {
  @Override
  public double totalAmount(int daysRented) {
    double amount = 0;
    if (daysRented > 3) {
      amount += (daysRented - 3) * 1.5;
    }
    amount += 1.5;
    return amount;
  }

  @Override
  public int frequentRenterPoints(int daysRented) {
    return DEFAULT_FREQUENT_RENTAL_POINT;
  }
}
