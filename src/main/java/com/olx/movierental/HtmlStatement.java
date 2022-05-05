package com.olx.movierental;

public class HtmlStatement {
  private final String name;
  private final Rentals rentals;

  public HtmlStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String generate() {
    return htmlHeader() + htmlBody() + htmlFooter();
  }

  private String htmlFooter() {
    String statement = "Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b><br/>";
    statement += "You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints()) + "</b> frequent renter points";
    return statement;
  }

  private String htmlBody() {
    String statement = "";
    for (Rental rental : rentals) {

      //show figures for this rental
      statement += rental.getMovie().getTitle() + " " + String.valueOf(rental.amount()) + "<br/>";
    }
    return statement;
  }

  private String htmlHeader() {
    return "<h1>Rental Record for <i>" + name + "</i></h1><br/>";
  }
}
