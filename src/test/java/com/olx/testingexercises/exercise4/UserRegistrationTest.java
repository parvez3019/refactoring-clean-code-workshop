package com.olx.testingexercises.exercise4;

import com.olx.testingexercises.exercise4.EmailService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserRegistrationTest {

    @Test
    public void testEmailSentOnceOnRegister() {
        // Arrange
        EmailService mockEmailService = mock(EmailService.class);
        UserRegistration registration = new UserRegistration(mockEmailService);

        // Act
        registration.register("thor");

        // Assert
        verify(mockEmailService, times(1)).sendEmail("thor", "Welcome thor");
    }

    @Test
    public void testEmailSentTwiceOnDoubleRegister() {
        // Arrange
        EmailService mockEmailService = mock(EmailService.class);
        UserRegistration registration = new UserRegistration(mockEmailService);

        // Act
        registration.register("thor");
        registration.register("thor");

        // Assert
        verify(mockEmailService, times(2)).sendEmail("thor", "Welcome thor");
    }
}
