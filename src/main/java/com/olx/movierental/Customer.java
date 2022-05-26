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
    return statementHeader() + statementBody() + statementFooter();
  }

  private String statementFooter() {
    return "Amount owed is " + String.valueOf(totalAmount(rentals)) + "\n"
            + "You earned " + String.valueOf(totalFrequentRenterPoints(rentals))
            + " frequent renter points";
  }

  private String statementBody() {
    String statement = "";
    for (Rental rental : rentals) {
      statement += "\t" + rental.getMovie().getTitle() + "\t" +
              String.valueOf(rental.amount()) + "\n";
    }
    return statement;
  }

  private String statementHeader() {
    return "Rental Record for " + getName() + "\n";
  }

  private int totalFrequentRenterPoints(List<Rental> rentals) {
    int frequentRenterPoints = 0;
    for (Rental rental : rentals) {
      frequentRenterPoints += rental.frequentRenterPoint();
    }
    return frequentRenterPoints;
  }

  private double totalAmount(List<Rental> rentals) {
    double totalAmount = 0;
    for (Rental rental : rentals) {
      totalAmount += rental.amount();
    }
    return totalAmount;
  }

  public String htmlStatement() {
    return htmlStatementHeader() + htmlStatementBody() + htmlStatementFooter();
  }

  private String htmlStatementFooter() {
    return "Amount owed is <b>" + totalAmount(rentals) + "</b><br/>" +
            "You earned <b>" + totalFrequentRenterPoints(rentals) + "</b> frequent renter points";
  }

  private String htmlStatementBody() {
    String statement = "";
    for (Rental rental : rentals) {
      statement += rental.getMovie().getTitle() + " " + rental.amount() + "<br/>";
    }
    return statement;
  }

  private String htmlStatementHeader() {
    return "<h1>Rental Record for <b>" + getName() + "</b></h1><br/>";
  }
}

