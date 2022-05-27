package com.olx.movierental;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {
    @Test
    public void shouldGenerateTextStatement() {
        Customer customer = new Customer("Utsav");

        customer.addRental(new Rental(new Movie("Titanic", 0), 3));
        customer.addRental(new Rental(new Movie("Terminator", 1), 2));
        customer.addRental(new Rental(new Movie("DDLJ", 2), 4));

        String actualStatement = customer.statement();

        String expectedStatement = "Rental Record for Utsav\n" +
                "\tTitanic\t3.5\n" +
                "\tTerminator\t6.0\n" +
                "\tDDLJ\t3.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points";
        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    public void shouldGenerateHTMLStatement() {
        Customer customer = new Customer("Utsav");

        customer.addRental(new Rental(new Movie("Titanic", 0), 3));
        customer.addRental(new Rental(new Movie("Terminator", 1), 2));
        customer.addRental(new Rental(new Movie("DDLJ", 2), 4));

        String actualStatement = customer.htmlStatement();

        String expectedStatement = "<h1>Rental Record for <b>Utsav</b></h1><br/>" +
                "Titanic 3.5<br/>" +
                "Terminator 6.0<br/>" +
                "DDLJ 3.0<br/>" +
                "Amount owed is <b>12.5</b><br/>" +
                "You earned <b>4</b> frequent renter points";
        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    public void shouldGenerateHTMLStatementWithBlueRay() {
        Customer customer = new Customer("Utsav");

        customer.addRental(new Rental(new Movie("Titanic", 0), 3));
        customer.addRental(new Rental(new Movie("Terminator", 1), 2));
        customer.addRental(new Rental(new Movie("DDLJ", 2), 4));
        customer.addRental(new Rental(new Movie("KGF", 3), 4));

        String actualStatement = customer.htmlStatement();

        String expectedStatement = "<h1>Rental Record for <b>Utsav</b></h1><br/>" +
                "Titanic 3.5<br/>" +
                "Terminator 6.0<br/>" +
                "DDLJ 3.0<br/>" +
                "KGF 16.0<br/>" +
                "Amount owed is <b>28.5</b><br/>" +
                "You earned <b>7</b> frequent renter points";
        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    public void shouldGenerateTextStatementWithBlueRay() {
        Customer customer = new Customer("Utsav");

        customer.addRental(new Rental(new Movie("Titanic", 0), 3));
        customer.addRental(new Rental(new Movie("Terminator", 1), 2));
        customer.addRental(new Rental(new Movie("DDLJ", 2), 4));
        customer.addRental(new Rental(new Movie("KGF", 3), 4));

        String actualStatement = customer.statement();

        String expectedStatement = "Rental Record for Utsav\n" +
                "\tTitanic\t3.5\n" +
                "\tTerminator\t6.0\n" +
                "\tDDLJ\t3.0\n" +
                "\tKGF\t16.0\n" +
                "Amount owed is 28.5\n" +
                "You earned 7 frequent renter points";
        assertEquals(expectedStatement, actualStatement);
    }

}
