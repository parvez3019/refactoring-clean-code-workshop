package com.olx.testingexercises.exercise5;

public class InvoiceService {
    private final PaymentGateway gateway;

    public InvoiceService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public String generateInvoice(String userId, double amount) {
        if (gateway.process(userId, amount)) {
            return "Invoice generated for: " + userId;
        }
        return "Payment failed for: " + userId;
    }
}

/*

Tasks:
- Stub the process() method to return true and false.
- Assert the right message is returned in both cases.
- Use verify() to check that process was called once.

*/