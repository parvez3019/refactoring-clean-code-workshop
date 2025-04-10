package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserRegistrationTest {

    @Test
    void registration() {
        EmailService mockedEmailService = mock(EmailService.class);
        String user = "test";
        UserRegistration userRegistration = new UserRegistration(mockedEmailService);

        userRegistration.register(user);

        verify(mockedEmailService, times(1)).sendEmail(user, "Welcome "+user);
    }

    @Test
    void twiceRegistration() {
        EmailService mockedEmailService = mock(EmailService.class);
        String user1 = "test";
        String user2 = "test";
        UserRegistration userRegistration = new UserRegistration(mockedEmailService);

        userRegistration.register(user1);
        userRegistration.register(user2);

        verify(mockedEmailService, times(2)).sendEmail(user1, "Welcome "+user1);
    }
}