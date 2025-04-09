package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
public class SessionManagerTest {

    private SessionManager sessionManager;
    @BeforeEach
    public void setUp() {
        sessionManager = new SessionManager();
        sessionManager.startSession();
    }
    @Test
    void isSessionActive() {
        assertTrue(sessionManager.isSessionActive());
    }
    @Test
    void setSession() {
        sessionManager.endSession();
        boolean active = sessionManager.isSessionActive();
        assertFalse(active);
    }

    @AfterEach
    void tearDown() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive());

    }
}