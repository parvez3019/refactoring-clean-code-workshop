package com.olx.testing.lesson3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account(); // reusable setup
    }

    @Test
    public void testDeposit() {
        account.deposit(100);
        account.deposit(200);
        assertEquals(300, account.getBalance());
    }
    @Test
    public void testDeposit1() {
        account.deposit(200);
        assertEquals(200, account.getBalance());
    }
    @AfterEach
    public void tearDown() {
        account = null;
    }
}