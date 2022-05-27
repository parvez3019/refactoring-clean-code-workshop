package com.olx.movierental;

public class Customer {
    private String name;
    private Rentals rentals = new Rentals();

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
        return new TextStatement().statement(name, rentals);
    }

    public String htmlStatement() {
        return new HtmlStatement().statement(name, rentals);
    }

}

