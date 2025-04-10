package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {

    @Test
    void register() {
        EmailService emailService=mock(EmailService.class);
        UserRegistration userRegistration = new UserRegistration(emailService);

        userRegistration.register("Shivanshu");
        userRegistration.register("Shivanshu");


        verify(emailService,times(2)).sendEmail("Shivanshu", "Welcome Shivanshu");
    }
}