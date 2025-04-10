package com.olx.testing.lesson4;

public class OrderProcessor {
    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {

        this.notificationService = notificationService;
    }

    public int processOrder(String orderId) {
        System.out.println("Processing order " + orderId);
        notificationService.send("Order " + orderId + " processed");
        return 1;
    }
}

