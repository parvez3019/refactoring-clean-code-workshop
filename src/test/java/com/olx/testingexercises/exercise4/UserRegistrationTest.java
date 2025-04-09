package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

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
    }
}