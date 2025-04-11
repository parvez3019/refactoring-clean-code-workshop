package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {
    InvoiceService invoiceService;
    PaymentGateway mockedPaymentGateway;
    @BeforeEach
    void setUp() {
        mockedPaymentGateway = mock(PaymentGateway.class);
        when(mockedPaymentGateway.process(anyString(), anyDouble())).thenReturn(true);
        invoiceService = new InvoiceService(mockedPaymentGateway);
    }

    @Test
    void testGenerateInvoice() {
        assertEquals("Invoice generated for: uid123", invoiceService.generateInvoice("uid123", 1000));
    }
    @Test
    void testPaymentGatewayIsCalled() {
        invoiceService.generateInvoice("uid123", 1000);
        verify(mockedPaymentGateway, times(1)).process(anyString(), anyDouble());
    }
}