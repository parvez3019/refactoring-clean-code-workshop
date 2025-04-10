package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.extension.ExtensionRegistry;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserRegistrationTest {

    @Test
    void register() {
        EmailService emailService = mock(EmailService.class);
        UserRegistration userRegistration = new UserRegistration(emailService);

        userRegistration.register(anyString());
        userRegistration.register(anyString());

        verify(emailService,times(2)).sendEmail(anyString(), anyString());
    }
}
