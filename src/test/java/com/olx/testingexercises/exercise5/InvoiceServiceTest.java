package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvoiceServiceTest {

    @Test
    public void generateInvoice() {
        PaymentGateway gateway= mock(PaymentGateway.class);
        when(gateway.process("user123",100)).thenReturn(true);
        InvoiceService invoiceService = new InvoiceService(gateway);
        String result=invoiceService.generateInvoice("user123",100);
        assertEquals("Invoice generated for: user123",result);
    }
}