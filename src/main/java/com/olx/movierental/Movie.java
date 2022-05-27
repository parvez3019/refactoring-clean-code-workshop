package com.olx.movierental;

public class Movie {


    private String title;
    private PriceCode priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = PriceCodeFactory.priceCodeFactory(priceCode);
    }


    public String getTitle() {
        return title;
    }

    public PriceCode priceCode() {
        return priceCode;
    }


}
