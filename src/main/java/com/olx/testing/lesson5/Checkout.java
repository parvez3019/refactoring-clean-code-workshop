package com.olx.testing.lesson5;

public class Checkout {
    private final PriceService priceService;

    public Checkout(PriceService priceService) {

        this.priceService = priceService;
    }

    public double calculateTotal(String productId, int quantity) {

        return priceService.getPrice(productId) * quantity;
    }
}
