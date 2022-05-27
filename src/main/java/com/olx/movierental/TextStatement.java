package com.olx.movierental;

public class TextStatement {

    public String statement(String name, Rentals rentals) {
        return header(name) + body(rentals) + footer(rentals);
    }

    private String footer(Rentals rentals) {
        return "Amount owed is " + rentals.totalAmount() + "\n"
                + "You earned " + rentals.totalFrequentRenterPoints()
                + " frequent renter points";
    }

    private String body(Rentals rentals) {
        String statement = "";
        for (Rental rental : rentals) {
            statement += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";
        }
        return statement;
    }

    private String header(String name) {
        return "Rental Record for " + name + "\n";
    }


}
