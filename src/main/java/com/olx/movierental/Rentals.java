package com.olx.movierental;

import java.util.ArrayList;
import java.util.List;

public class Rentals extends ArrayList<Rental> {

    public int totalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.frequentRenterPoint();
        }
        return frequentRenterPoints;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            totalAmount += rental.amount();
        }
        return totalAmount;
    }
}
