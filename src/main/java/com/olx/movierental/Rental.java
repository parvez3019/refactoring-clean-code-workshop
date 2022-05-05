package com.olx.movierental;

public class Rental {

    public static final int BONUS_FREQUENT_RENTAL_POINTS = 2;
    public static final int DEFAULT_FREQUENT_RENTAL_POINT = 1;
    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double amount() {
        return getMovie().getPriceCode().totalAmount(getDaysRented());
    }

    int frequentRenterPoints() {
        return getMovie().getPriceCode().frequentRenterPoints(getDaysRented());
    }
}
