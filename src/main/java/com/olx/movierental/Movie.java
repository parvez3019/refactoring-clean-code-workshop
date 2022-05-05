package com.olx.movierental;

public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;
  public static final int BLU_RAY_PRICE_CODE = 3;

  private String title;
  private PriceCode priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode(priceCode);
  }

  public PriceCode getPriceCode() {
    return priceCode;
  }


  public String getTitle() {
    return title;
  }

  private static PriceCode priceCode(int priceCode) {
    switch (priceCode) {
      case REGULAR:
        return new RegularPriceCode();
      case NEW_RELEASE:
        return new NewReleasePriceCode();
      case CHILDRENS:
        return new ChildrenPriceCode();
      case BLU_RAY_PRICE_CODE:
        return new BluRayPriceCode();
    }
    return new UnknownPriceCode();
  }
}
