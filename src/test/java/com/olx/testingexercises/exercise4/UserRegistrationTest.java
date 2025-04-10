package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserRegistrationTest {

    UserRegistration userRegistration;
    EmailService mockEmailService;

    @BeforeEach
    void setUp() {
        mockEmailService = mock(EmailService.class);
        userRegistration = new UserRegistration(mockEmailService);
    }

    @Test
    void register() {
        String user = "test@test.com";

        userRegistration.register(user);

        verify(mockEmailService, times(1)).sendEmail(user, "Welcome " + user);
    }

    @Test
    void register_nullUser() {
        String user = "test@test.com";
        userRegistration.register(user);
        verify(mockEmailService, times(2)).sendEmail(user, "Welcome " + user);
    }

}