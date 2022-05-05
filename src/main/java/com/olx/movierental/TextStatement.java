package com.olx.movierental;

public class TextStatement {
  private final String customerName;
  private final Rentals rentals;

  public TextStatement(String name, Rentals rentals) {
    this.customerName = name;
    this.rentals = rentals;
  }

  public String statement() {
    return header() + body() + footer();
  }

  private String header() {
    return "Rental Record for " + customerName + "\n";
  }

  private String footer() {
    String statement = "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
    statement += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints()) + " frequent renter points";
    return statement;
  }

  private String body() {
    String statement = "";
    for (Rental rental : rentals) {

      //show figures for this rental
      statement += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.amount()) + "\n";
    }
    return statement;
  }
}
