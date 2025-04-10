package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.verification.VerificationMode;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {

    @Test
    void generateInvoice() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        when(paymentGateway.process(anyString(), anyDouble())).thenReturn(false);

        InvoiceService invoiceService = new InvoiceService(paymentGateway);
        String result = invoiceService.generateInvoice("user1", 100.0);

        assertEquals("Payment failed for: user1", result);
        verify(paymentGateway, times(1)).process(anyString(), anyDouble());
    }

    @Test
    void generateInvoiceSuccessful() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        when(paymentGateway.process(anyString(), anyDouble())).thenReturn(true);

        InvoiceService invoiceService = new InvoiceService(paymentGateway);
        String result = invoiceService.generateInvoice("user1", 100.0);

        assertEquals("Invoice generated for: user1", result);
        verify(paymentGateway, times(1)).process(anyString(), anyDouble());
    }
}
