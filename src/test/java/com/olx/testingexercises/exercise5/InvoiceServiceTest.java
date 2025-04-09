package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {
    private PaymentGateway mockpaymentGateway;
    private InvoiceService invoiceService;
    @BeforeEach
    void setUp() {
        mockpaymentGateway = mock(PaymentGateway.class);
        invoiceService = new InvoiceService(mockpaymentGateway);
    }
    @Test
    void processPayment() {
        String userid = "user1234";
        double amount = 1000.0;
        when(mockpaymentGateway.process(userid, amount)).thenReturn(true);
        String result = invoiceService.generateInvoice(userid,amount);
        assertEquals("Invoice generated for: " + userid ,result);
        verify(mockpaymentGateway,times(1)).process(userid,amount);
    }

    @Test
    void processPaymentfailed() {
        String userid = "user1234";
        double amount = 1000.0;
        when(mockpaymentGateway.process(userid, amount)).thenReturn(false);
        String result = invoiceService.generateInvoice(userid,amount);
        assertEquals("Payment failed for: " + userid ,result);
        verify(mockpaymentGateway,times(1)).process(userid,amount);
    }
}