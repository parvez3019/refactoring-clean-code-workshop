package com.olx.testingexercises.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    void sendEmail() {
        EmailService emailService = new EmailService();
        emailService.sendEmail("Test", "Test Message");
    }
}