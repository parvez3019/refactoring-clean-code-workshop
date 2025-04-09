package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserRegistrationTest {
    private UserRegistration userRegistration;
    private EmailService mockedEmailService;

    @BeforeEach
    public void setUp() {
        mockedEmailService = mock(EmailService.class);
        userRegistration = new UserRegistration(mockedEmailService);
    }

    @Test
    public void userRegistrationOnce() {
        String user = "userName";
        userRegistration.register(user);
        verify(mockedEmailService,times(1)).sendEmail(user, "Welcome " + user);
    }

    @Test
    public void twoUsersRegistration() {
        userRegistration.register("Pravaz");
        userRegistration.register("Ravi");
        verify(mockedEmailService,times(2)).sendEmail(any(), any());
    }

    @Test
    public void userRegistrationTwice() {
        String user = "userName";
        userRegistration.register(user);
        userRegistration.register(user);
        verify(mockedEmailService,times(2)).sendEmail(user, "Welcome " + user);
    }

    @AfterEach
    public void tearDown() {
        userRegistration = null;
        mockedEmailService = null;
    }

}