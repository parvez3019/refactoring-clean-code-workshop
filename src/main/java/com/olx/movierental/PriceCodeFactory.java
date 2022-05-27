package com.olx.movierental;

public class PriceCodeFactory {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private static final int BLUERAY = 3;

    public static PriceCode priceCodeFactory(int priceCode) {

        switch (priceCode) {
            case REGULAR:
                return new RegularPriceCode();
            case NEW_RELEASE:
                return new NewReleasePriceCode();
            case CHILDRENS:
                return new ChildrenPriceCode();
            case BLUERAY:
                return new BluerayPriceCode();
            default:
                return new DefaultPriceCode();
        }

    }
}
