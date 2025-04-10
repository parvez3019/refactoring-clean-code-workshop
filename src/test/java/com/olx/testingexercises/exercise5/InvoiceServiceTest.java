package com.olx.testingexercises.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class InvoiceServiceTest {

    @Test
    public void testGenerateInvoice_whenPaymentSucceeds() {
        PaymentGateway mockgateway=mock(PaymentGateway.class);

        when(mockgateway.process("user123", 100.0)).thenReturn(true);
        InvoiceService invoiceService=new InvoiceService(mockgateway);

        String result = invoiceService.generateInvoice("user123", 100.0);

        // Assert
        assertEquals("Invoice generated for: user123", result);
        verify(mockgateway, times(1)).process("user123", 100.0);

    }
    @Test
    public void testGenerateInvoice_whenPaymentFailed() {
        PaymentGateway mockgateway=mock(PaymentGateway.class);
        when(mockgateway.process("user123", 100.0)).thenReturn(false);
    }
}