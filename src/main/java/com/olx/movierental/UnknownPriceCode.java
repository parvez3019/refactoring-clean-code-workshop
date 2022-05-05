package com.olx.movierental;

public class UnknownPriceCode implements PriceCode {
  @Override
  public double totalAmount(int daysRented) {
    return 0;
  }

  @Override
  public int frequentRenterPoints(int daysRented) {
    return 0;
  }
}
