package com.olx.testing.lesson4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderProcessorTest {

   @Test
   public void processOrder() {
       NotificationService notificationService = mock(NotificationService.class);
       OrderProcessor orderProcessor = new OrderProcessor(notificationService);

       int processedOrderStatus = orderProcessor.processOrder("123");

       assertEquals(1, processedOrderStatus);
       verify(notificationService, times(1)).send("Order 123 processed");
   }

    @Test
    public void testProcessOrderSendsNotification() {
        NotificationService mockService = mock(NotificationService.class);
        OrderProcessor processor = new OrderProcessor(mockService);

        processor.processOrder("123");

        verify(mockService,times(1)).send("Order 123 processed");
    }
}
