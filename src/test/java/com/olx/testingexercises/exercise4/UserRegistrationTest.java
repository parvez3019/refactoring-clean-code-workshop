package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class UserRegistrationTest {
    private EmailService mockemailService ;
    private UserRegistration userRegistration;
    @BeforeEach
    public void setUp() {
        mockemailService = mock(EmailService.class);
    }
    @Test
    void registerUser() {

    }


}