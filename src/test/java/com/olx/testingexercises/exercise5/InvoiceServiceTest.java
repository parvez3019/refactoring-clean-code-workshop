package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {
    PaymentGateway mockPaymentGateway;
    InvoiceService invoiceService;

    @BeforeEach
    void setUp() {
        mockPaymentGateway = mock(PaymentGateway.class);
        invoiceService = new InvoiceService(mockPaymentGateway);
    }

    @Test
    void generateInvoice() {
        String user ="test@test.com";
        double amount = 100.0;

        when(mockPaymentGateway.process(user, amount)).thenReturn(true);
        String result = invoiceService.generateInvoice(user, amount);

        assertEquals("Invoice generated for: " + user, result);
        verify(mockPaymentGateway, times(1)).process(user, amount);
    }

    @Test
    void generateInvoiceTwice() {
        String user ="test@test.com";
        double amount = 100.0;

        when(mockPaymentGateway.process(user, amount)).thenReturn(true);
        String result = invoiceService.generateInvoice(user, amount);

        assertEquals("Invoice generated for: " + user, result);
        verify(mockPaymentGateway, times(2)).process(user, amount);
    }

    @Test
    void generateInvoiceFailed() {
        String user ="test@test.com";
        double amount = 100.0;

        when(mockPaymentGateway.process(user, amount)).thenReturn(false);
        String result = invoiceService.generateInvoice(user, amount);

        assertEquals("Payment failed for: " + user, result);
        verify(mockPaymentGateway, times(1)).process(user, amount);
    }

    @Test
    void generateInvoiceFailedTwice() {
        String user ="test@test.com";
        double amount = 100.0;

        when(mockPaymentGateway.process(user, amount)).thenReturn(false);
        String result = invoiceService.generateInvoice(user, amount);

        assertEquals("Payment failed for: " + user, result);
        verify(mockPaymentGateway, times(2)).process(user, amount);
    }
}