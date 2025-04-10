package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {

    public PaymentGateway paymentGateway;
    public InvoiceService invoiceService;

    @BeforeEach
    void setUp() {
        paymentGateway =  mock(PaymentGateway.class);
        invoiceService = new InvoiceService(paymentGateway);
    }

    @Test
    void successFullInvoiceGeneration() {
        String user = "abhi@gmail.com";
        double amount = 100.0;

        when(paymentGateway.process(user, amount)).thenReturn(true);

        String invoice = invoiceService.generateInvoice(user, amount);

        assertEquals("Invoice generated for: " + user, invoice);

        verify(paymentGateway, times(1)).process(user, amount);
    }

    void inSuccessFullInvoiceGeneration() {
        String user = "abhi@gmail.com";
        double amount = 100.0;

        when(paymentGateway.process(user, amount)).thenReturn(false);

        String invoice = invoiceService.generateInvoice(user, amount);

        assertEquals("Invoice generated for: " + user, invoice);

        verify(paymentGateway, times(1)).process(user, amount);
    }

}