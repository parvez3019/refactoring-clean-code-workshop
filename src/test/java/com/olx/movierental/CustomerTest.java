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

        String actualStatement = customer.statement();

        String statement ="Rental Record for Harsh\n" +
                "\tDie Hard 4.0\t3.5\n" +
                "\tIrish Man\t3.0\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 9.5\n" +
                "You earned 3 frequent renter points";
        Assert.assertEquals(statement, actualStatement);
    }

}
