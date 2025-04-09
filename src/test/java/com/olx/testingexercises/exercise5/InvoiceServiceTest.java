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
        String expectedInvoiceStatus = "Invoice generated for: " + userId;

        String invoiceStatus = invoiceService.generateInvoice(userId, amount);

        assertEquals(expectedInvoiceStatus, invoiceStatus);
    }

    @Test
    public void shouldGenerateInvoiceWithSingleInvocation() {
        when(gateway.process(userId, amount)).thenReturn(true);

        invoiceService.generateInvoice(userId, amount);

        verify(gateway, times(1)).process(userId, amount);
    }

    @Test
    public void shouldNotGenerateInvoice() {
        when(gateway.process(userId, amount)).thenReturn(false);
        String expectedInvoiceStatus = "Payment failed for: " + userId;

        String invoiceStatus = invoiceService.generateInvoice(userId, amount);

        assertEquals(expectedInvoiceStatus + userId, invoiceStatus);
    }

    @Test
    public void shouldNotGenerateInvoiceWithSingleInvocation() {
        when(gateway.process(userId, amount)).thenReturn(false);
        invoiceService.generateInvoice(userId, amount);

        verify(gateway, times(1)).process(userId, amount);
    }

    @AfterEach
    public void tearDown() {
        gateway = null;
        invoiceService = null;
    }
}