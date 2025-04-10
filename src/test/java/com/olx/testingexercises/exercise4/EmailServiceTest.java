package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class EmailServiceTest{

    @Test
    void register_shouldSendWelcomeEmailOnce() {

        EmailService emailService = mock(EmailService.class);
        UserRegistration registration = new UserRegistration(emailService);


        registration.register("anurag@example.com");


        verify(emailService, times(1)).sendEmail("anurag@example.com", "Welcome anurag@example.com");
    }
}
