package com.olx.testing.lesson4;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class OrderProcessorTest {

    @Test
    public void testProcessOrderSendsNotification() {
        NotificationService mockService = mock(NotificationService.class);
        OrderProcessor processor = new OrderProcessor(mockService);

        processor.processOrder("123");

        verify(mockService).send("Order 123 processed");
    }
}
