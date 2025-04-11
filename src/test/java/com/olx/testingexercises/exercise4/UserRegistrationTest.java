package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserRegistrationTest {
    public UserRegistration userRegistrationObj;
    public EmailService emailService;

    @BeforeEach
    void setUp() {
        emailService = mock(EmailService.class);

        userRegistrationObj = new UserRegistration(emailService);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void register() {
        userRegistrationObj.register("Aryan");
        verify(emailService, times(1)).sendEmail(any(), any());
    }
}