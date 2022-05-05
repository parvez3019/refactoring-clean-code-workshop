package com.olx.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return header() + body() + footer();
    }

    private String header() {
        return "Rental Record for " + getName() + "\n";
    }

    private String footer() {
        String statement = "Amount owed is " + String.valueOf(totalAmount()) + "\n";
        statement += "You earned " + String.valueOf(totalFrequentRenterPoints())
                + " frequent renter points";
        return statement;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {

            totalAmount += rental.amount();
        }
        return totalAmount;
    }

    private String body() {
        String statement = "";
        for (Rental rental : rentals) {

            //show figures for this rental
            statement += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(rental.amount()) + "\n";
        }
        return statement;
    }

    private int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.frequentRenterPoints();

        }
        return totalFrequentRenterPoints;
    }

    public String htmlStatement() {
        return htmlHeader() + htmlBody() + htmlFooter();
    }

    private String htmlFooter() {
        String statement = "Amount owed is <b>" + String.valueOf(totalAmount()) + "</b><br/>";
        statement += "You earned <b>" + String.valueOf(totalFrequentRenterPoints())
                + "</b> frequent renter points";
        return statement;
    }

    private String htmlBody() {
        String statement = "";
        for (Rental rental : rentals) {

            //show figures for this rental
            statement += rental.getMovie().getTitle() + " " +
                    String.valueOf(rental.amount()) + "<br/>";
        }
        return statement;
    }

    private String htmlHeader() {
        return "<h1>Rental Record for <i>" + getName() + "</i></h1><br/>";
    }
}

