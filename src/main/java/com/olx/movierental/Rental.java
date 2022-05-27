package com.olx.movierental;

public class Rental {

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

    public double amount() {

        PriceCode priceCode = movie.priceCode();

        return priceCode.amount(daysRented);

    }

    public int frequentRenterPoint() {
        PriceCode priceCode = movie.priceCode();

        return priceCode.frequentRentalPoints(daysRented);
    }


}
