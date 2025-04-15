package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionManagerTest {

    SessionManager sessionManager;
    @BeforeEach
    public void beginSession() {
        sessionManager = new SessionManager();
        assertFalse(sessionManager.isSessionActive(), "Session should be active after starting");
        sessionManager.startSession();
    }

    @Test
    public void testIsSessionActive() {
        assertTrue(sessionManager.isSessionActive(), "Session should be active");
    }

    @AfterEach
    public void endSession() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive(), "Session should be not active");
    }
}