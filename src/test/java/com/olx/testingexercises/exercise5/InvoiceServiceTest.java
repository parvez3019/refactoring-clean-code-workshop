package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {

    @Test
    void generateInvoice() {
        PaymentGateway paymentGateway = mock(PaymentGateway.class);
        when(paymentGateway.process("12",5)).thenReturn(true);
        InvoiceService invoiceService = new InvoiceService(paymentGateway);

        String status=invoiceService.generateInvoice("12",5);
        assertEquals("Invoice generated for: 12",status);



    }
}