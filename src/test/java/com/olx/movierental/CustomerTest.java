package com.olx.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void shouldGenerateTextStatement() {
        Customer customer = new Customer("Harsh");

        customer.addRental(new Rental(new Movie("Die Hard 4.0", 0), 3));
        customer.addRental(new Rental(new Movie("Irish Man", 1), 1));
        customer.addRental(new Rental(new Movie("Toy Story", 2), 4));
        customer.addRental(new Rental(new Movie("BluRay", 3), 1));

        String actualStatement = customer.statement();

        String statement = "Rental Record for Harsh\n" +
                "\tDie Hard 4.0\t3.5\n" +
                "\tIrish Man\t3.0\n" +
                "\tToy Story\t3.0\n" +
                "\tBluRay\t4.0\n" +
                "Amount owed is 13.5\n" +
                "You earned 6 frequent renter points";
        Assert.assertEquals(statement, actualStatement);
    }

    @Test
    public void shouldGenerateHTMLStatement() {
        Customer customer = new Customer("Harsh");

        customer.addRental(new Rental(new Movie("Die Hard 4.0", 0), 3));
        customer.addRental(new Rental(new Movie("Irish Man", 1), 1));
        customer.addRental(new Rental(new Movie("Toy Story", 2), 4));

        String actualStatement = customer.htmlStatement();

        String statement = "<h1>Rental Record for <i>Harsh</i></h1><br/>" +
                "Die Hard 4.0 3.5<br/>" +
                "Irish Man 3.0<br/>" +
                "Toy Story 3.0<br/>" +
                "Amount owed is <b>9.5</b><br/>" +
                "You earned <b>3</b> frequent renter points";

        Assert.assertEquals(statement, actualStatement);
    }


}
