package com.olx.testingexercises.exercise4;

public class UserRegistration {
    private final EmailService emailService;

    public UserRegistration(EmailService emailService) {

        this.emailService = emailService;
    }

    public void register(String user) {
        // logic to register
        emailService.sendEmail(user, "Welcome " + user);
    }

}

/*

Tasks:
- Use a mock of EmailService and verify that it’s called once with correct message.
- Negative test: Register twice and assert that email was sent twice using verify(..., times(2)).

*/
