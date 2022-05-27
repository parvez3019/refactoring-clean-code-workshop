package com.olx.movierental;

public class HtmlStatement {

    public String statement(String name, Rentals rentals) {
        return header(name) + body(rentals) + footer(rentals);
    }

    private String footer(Rentals rentals) {
        return "Amount owed is <b>" + rentals.totalAmount() + "</b><br/>" +
                "You earned <b>" + rentals.totalFrequentRenterPoints() + "</b> frequent renter points";
    }

    private String body(Rentals rentals) {
        String statement = "";
        for (Rental rental : rentals) {
            statement += rental.getMovie().getTitle() + " " + rental.amount() + "<br/>";
        }
        return statement;
    }

    private String header(String name) {
        return "<h1>Rental Record for <b>" + name + "</b></h1><br/>";
    }
}
