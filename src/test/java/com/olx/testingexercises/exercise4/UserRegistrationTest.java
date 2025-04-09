package com.olx.testingexercises.exercise4;

import com.olx.testingexercises.exercise3.ExchangeRateService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserRegistrationTest {

    private static UserRegistration userRegistration;
    private static EmailService emailService;

    @BeforeAll
    static void setUp() {
        emailService = mock(EmailService.class);
        userRegistration = new UserRegistration(emailService);
    }

    @Test
    public void testEmailSentOnceOnRegistration() {
        String user = "yash@olx.in";

        userRegistration.register(user);

        verify(emailService, times(1)).sendEmail(user, "Welcome " + user);
    }

    @Test
    public void testEmailSentTwiceOnRegistration() {
        String user = "sharma@olx.in";

        userRegistration.register(user);
        userRegistration.register(user);

        verify(emailService, times(2)).sendEmail(user, "Welcome " + user);
    }
}