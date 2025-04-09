package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InvoiceServiceTest {

    @Test
    void generateInvoice_shouldReturnSuccessMessage_whenPaymentIsSuccessful() {

        PaymentGateway gateway = mock(PaymentGateway.class);
        when(gateway.process("user123", 1500.0)).thenReturn(true);

        InvoiceService service = new InvoiceService(gateway);

        String result = service.generateInvoice("user123", 1500.0);

        assertEquals("Invoice generated for: user123", result);
        verify(gateway, times(1)).process("user123", 1500.0);
    }
}
