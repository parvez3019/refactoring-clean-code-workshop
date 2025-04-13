package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class UserRegistrationTest {

    @Test
    void shouldSendEmailTwiceWhenRegisteringTwoUsers() {
        EmailService emailService = mock(EmailService.class);
        UserRegistration userRegistration = new UserRegistration(emailService);
        String firstUser = "user1@example.com";
        String secondUser = "user2@example.com";

        userRegistration.register(firstUser);
        userRegistration.register(secondUser);

        verify(emailService).sendEmail(firstUser, "Registration confirmation");
        verify(emailService).sendEmail(secondUser, "Registration confirmation");
    }
}