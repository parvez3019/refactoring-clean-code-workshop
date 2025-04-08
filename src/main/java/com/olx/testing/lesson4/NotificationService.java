package com.olx.testing.lesson4;

//Lesson 4: Mocking with Mockito
//Concept: Use Mockito to mock dependencies.

public class NotificationService {
    public void send(String message) {
        // Imagine sending an email or SMS
        System.out.println("Sending message: " + message);
    }
}