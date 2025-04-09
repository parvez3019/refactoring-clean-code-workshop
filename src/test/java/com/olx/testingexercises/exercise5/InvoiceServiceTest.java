package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {

    private static InvoiceService invoiceService;
    private static PaymentGateway gateway;

    @BeforeAll
    static void setUp() {
        gateway = mock(PaymentGateway.class);
        invoiceService = new InvoiceService(gateway);
    }

    @Test
    public void testInvoiceGeneratedWhenPaymentSucceeds() {
        when(gateway.process("yash", 1000.0)).thenReturn(true);

        String result = invoiceService.generateInvoice("yash", 1000.0);

        assertEquals("Invoice generated for: yash", result);
        verify(gateway, times(1)).process("yash", 1000.0);
    }

    @Test
    public void testInvoiceFailedWhenPaymentFails() {
        when(gateway.process("sharma", 500.0)).thenReturn(false);

        String result = invoiceService.generateInvoice("sharma", 500.0);

        assertEquals("Payment failed for: sharma", result);
        verify(gateway, times(1)).process("sharma", 500.0);
    }
}