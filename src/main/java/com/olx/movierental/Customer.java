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
    double totalAmount = 0;
    int totalFrequentRenterPoints = 0;
    String statement = "Rental Record for " + getName() + "\n";
    for (Rental rental : rentals) {
      totalFrequentRenterPoints += rental.frequentRenterPoints();

      //show figures for this rental
      statement += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(rental.amount()) + "\n";
      totalAmount += rental.amount();
    }

    //add footer lines statement
    statement += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    statement += "You earned " + String.valueOf(totalFrequentRenterPoints)
        + " frequent renter points";
    return statement;
  }

}

