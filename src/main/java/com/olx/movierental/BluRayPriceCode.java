package com.olx.movierental;

public class BluRayPriceCode implements PriceCode {

  private static int BLU_RAY_PER_DAY_RENT = 4;
  private static int BLU_RAY_FREQUENT_RENTER_POINT = 3;

  @Override
  public double totalAmount(int daysRented) {
    return daysRented * BLU_RAY_PER_DAY_RENT;
  }

  @Override
  public int frequentRenterPoints(int daysRented) {
    return BLU_RAY_FREQUENT_RENTER_POINT;
  }
}
