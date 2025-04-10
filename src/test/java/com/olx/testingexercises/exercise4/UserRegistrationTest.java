package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationMode;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserRegistrationTest {
    public EmailService emailService;
    public UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        emailService = mock(EmailService.class);
        userRegistration = new UserRegistration(emailService);
    }

    @Test
    public void testWelcomeEmail() {
        String user = "Welcome@gmail.com";
        userRegistration.register(user);

        verify(emailService, times(1)).sendEmail(user, "Welcome " + user);
    }

    @Test
    public void testWelcomeEmailTwice() {
        String user = "Welcome@gmail.com";
        userRegistration.register(user);
        userRegistration.register(user);

        verify(emailService, times(2)).sendEmail(user, "Welcome " + user);
    }


}