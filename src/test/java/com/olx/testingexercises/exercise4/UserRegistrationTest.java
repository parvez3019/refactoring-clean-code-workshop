package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserRegistrationTest {
    private EmailService mockemailService ;
    private UserRegistration userRegistration;
    @BeforeEach
    public void setUp() {
        mockemailService = mock(EmailService.class);
        userRegistration = new UserRegistration(mockemailService);
    }
    @Test
    void registerUser_shouldSendEmailOnce() {
        String email = "shreya@example.com";
        userRegistration.register(email);

        verify(mockemailService, times(1)).sendEmail(email, "Welcome " + email);
    }

    @Test
    void registerUserTwice_shouldSendEmailTwice() {
        String email = "shreya@example.com";
        userRegistration.register(email);
        userRegistration.register(email);

        verify(mockemailService, times(2)).sendEmail(email, "Welcome " + email);
    }



}