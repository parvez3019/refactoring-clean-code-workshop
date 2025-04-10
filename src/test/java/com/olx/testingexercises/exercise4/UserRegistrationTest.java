package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class UserRegistrationTest {

    @Test
    void register() {
        EmailService emailService=mock(EmailService.class);
        UserRegistration userRegistration = new UserRegistration(emailService);
        userRegistration.register("user");
        verify(emailService,times(1)).sendEmail("user","Welcome user");
    }
}