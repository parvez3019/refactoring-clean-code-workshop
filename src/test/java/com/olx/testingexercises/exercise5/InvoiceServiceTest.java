package com.olx.testingexercises.exercise5;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceServiceTest {

    @Test
    public void testGenerateInvoiceSuccess() {
        // Arrange
        PaymentGateway mockGateway = mock(PaymentGateway.class);
        when(mockGateway.process("user123", 100.0)).thenReturn(true);

        InvoiceService invoiceService = new InvoiceService(mockGateway);

        // Act
        String result = invoiceService.generateInvoice("user123", 100.0);

        // Assert
        assertEquals("Invoice generated for: user123", result);
        verify(mockGateway, times(1)).process("user123", 100.0);
    }

    @Test
    public void testGenerateInvoiceFailure() {
        // Arrange
        PaymentGateway mockGateway = mock(PaymentGateway.class);
        when(mockGateway.process("user456", 200.0)).thenReturn(false);

        InvoiceService invoiceService = new InvoiceService(mockGateway);

        // Act
        String result = invoiceService.generateInvoice("user456", 200.0);

        // Assert
        assertEquals("Payment failed for: user456", result);
        verify(mockGateway, times(1)).process("user456", 200.0);
    }
}
