package com.olx.testing.lesson4;

public class OrderProcessor {
    private final NotificationService service;

    public OrderProcessor(NotificationService service) {
        this.service = service;
    }

    public void processOrder(String orderId) {
        // some logic
        service.send("Order " + orderId + " processed");
    }
}

