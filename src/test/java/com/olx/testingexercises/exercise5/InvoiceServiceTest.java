package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {

    @Test
    void generateInvoiceFailedPayment() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        when(paymentGateway.process("user1", 100.0)).thenReturn(false);
        InvoiceService invoiceService = new InvoiceService(paymentGateway);

        String result = invoiceService.generateInvoice("user1", 100.0);

        assertEquals("Payment failed for: user1", result);
        verify(paymentGateway).process("user1", 100.0);
    }

    @Test
    void generateInvoiceSuccessfulPayment() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        when(paymentGateway.process("user1", 100.0)).thenReturn(true);
        InvoiceService invoiceService = new InvoiceService(paymentGateway);

        String result = invoiceService.generateInvoice("user1", 100.0);

        assertEquals("Invoice generated for: user1", result);
        verify(paymentGateway).process("user1", 100.0);
    }
}