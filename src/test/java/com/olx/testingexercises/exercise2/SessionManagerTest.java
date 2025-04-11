package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionManagerTest {
    SessionManager sessionManager;
    @BeforeEach
    public void beginSession() {
        sessionManager = new SessionManager();
        assertFalse(sessionManager.isSessionActive());
        sessionManager.startSession();
    }

    @Test
    public void testIsSessionActive() {
        assertTrue(sessionManager.isSessionActive());
    }

    @AfterEach
    public void endSession() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive());
    }

}