package com.olx.testingexercises.exercise5;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class InvoiceServiceTest {
    private InvoiceService invoiceService;
    private PaymentGateway gateway;
    private String userId;
    private double amount;

    @BeforeEach
    public void setUp() {
        gateway = mock(PaymentGateway.class);
        invoiceService = new InvoiceService(gateway);
        userId = UUID.randomUUID().toString();
        amount = 10.00;
    }

    @Test
    public void shouldGenerateInvoice() {
        when(gateway.process(userId, amount)).thenReturn(true);
        String invoiceStatus = invoiceService.generateInvoice(userId, amount);
        assertEquals("Invoice generated for: " + userId, invoiceStatus);
        verify(gateway, times(1)).process(userId, amount);
    }

    @Test
    public void shouldNotGenerateInvoice() {
        when(gateway.process(userId, amount)).thenReturn(false);
        String invoiceStatus = invoiceService.generateInvoice(userId, amount);
        assertEquals("Payment failed for: " + userId, invoiceStatus);
        verify(gateway, times(1)).process(userId, amount);
    }

    @AfterEach
    public void tearDown() {
        gateway = null;
        invoiceService = null;
    }
}