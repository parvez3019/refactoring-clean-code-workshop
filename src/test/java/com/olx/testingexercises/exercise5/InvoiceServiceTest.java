package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {

    @Test
    void shouldGenerateInvoice() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        String userId = "userId";
        double amount = 100.0;
        InvoiceService invoiceService = new InvoiceService(paymentGateway);
        when(paymentGateway.process(userId, amount)).thenReturn(true);

        String call = invoiceService.generateInvoice(userId, amount);

        assertEquals("Invoice generated for: " + userId, call);
        verify(paymentGateway, times(1)).process(userId, amount);
    }

    @Test
    void shouldNotGenerateInvoice() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        String userId = "userId";
        double amount = 100.0;
        InvoiceService invoiceService = new InvoiceService(paymentGateway);
        when(paymentGateway.process(userId, amount)).thenReturn(false);

        String call = invoiceService.generateInvoice(userId, amount);

        assertEquals("Payment failed for: " + userId, call);
        verify(paymentGateway, times(1)).process(userId, amount);
    }
}