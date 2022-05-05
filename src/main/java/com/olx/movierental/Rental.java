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
        double amount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                if (getDaysRented() > 2) {
                    amount += (getDaysRented() - 2) * 1.5;
                }
                amount += 2;
                break;
            case Movie.NEW_RELEASE:
                amount += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                if (getDaysRented() > 3) {
                    amount += (getDaysRented() - 3) * 1.5;
                }
                amount += 1.5;
                break;
        }
        return amount;
    }

    int frequentRenterPoints() {
        if (isBonusApplicable()) return BONUS_FREQUENT_RENTAL_POINTS;
        return DEFAULT_FREQUENT_RENTAL_POINT;
    }

    private boolean isBonusApplicable() {
        return movie.isANewRelease()
                &&
                getDaysRented() > 1;
    }

}
