package com.olx.testing.lesson5;

//Lesson 5: Stubbing with Mockito
//Concept: Stub method calls to return specific values using when().thenReturn().

public class PriceService {
    public double getPrice(String productId) {
        // Calls DB or external API
        System.out.println("Getting price for product " + productId);
        return 0;
    }
}
