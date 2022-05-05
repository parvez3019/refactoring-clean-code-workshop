package com.olx.movierental;

public interface PriceCode {
  double totalAmount(int daysRented);
  int frequentRenterPoints(int daysRented);
}
