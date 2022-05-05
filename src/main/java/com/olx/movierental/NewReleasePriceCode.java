package com.olx.movierental;

import static com.olx.movierental.Rental.BONUS_FREQUENT_RENTAL_POINTS;
import static com.olx.movierental.Rental.DEFAULT_FREQUENT_RENTAL_POINT;

public class NewReleasePriceCode implements PriceCode {
  @Override
  public double totalAmount(int daysRented) {
    return daysRented * 3;
  }

  @Override
  public int frequentRenterPoints(int daysRented) {
    if (daysRented > 1) {
      return BONUS_FREQUENT_RENTAL_POINTS;

    }
    return DEFAULT_FREQUENT_RENTAL_POINT;
  }
}
