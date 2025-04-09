package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SessionManagerTest {
    private SessionManager sessionManager;

    @BeforeEach
    public void setUp() {
        sessionManager = new SessionManager();
    }

    @Test
    public void verifyInactiveSessionBeforeStart() {
        assertFalse(sessionManager.isSessionActive());
    }

    @Test
    public void verifyActiveSessionAfterStart() {
        sessionManager.startSession();

        assertTrue(sessionManager.isSessionActive());
    }

    @Test
    public void verifyInactiveSessionAfterEndSession() {
        sessionManager.endSession();

        assertFalse(sessionManager.isSessionActive());
    }

    @AfterEach
    public void tearDown() {
        sessionManager = null;
    }
}