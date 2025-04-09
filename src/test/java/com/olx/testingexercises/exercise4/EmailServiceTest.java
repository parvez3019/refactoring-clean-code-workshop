package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class EmailServiceTest{

    @Test
    void register_shouldSendWelcomeEmailOnce() {
        // Arrange
        EmailService emailService = mock(EmailService.class);
        UserRegistration registration = new UserRegistration(emailService);

        // Act
        registration.register("anurag@example.com");

        // Assert
        verify(emailService, times(1)).sendEmail("anurag@example.com", "Welcome anurag@example.com");
    }
}
