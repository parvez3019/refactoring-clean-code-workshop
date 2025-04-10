package com.olx.testing.lesson3;

//Lesson 3: Setup and Teardown
//Concept: Use @BeforeEach and @AfterEach for reusable test setup and cleanup.

public class Account {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}