package com.olx.testingexercises.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionManagerTest {
    SessionManager sessionManager;
    @Before
    public void beginSession() {
        sessionManager = new SessionManager();
        assertFalse(sessionManager.isSessionActive());
        sessionManager.startSession();
    }

    @Test
    public void testIsSessionActive() {
        assertTrue(sessionManager.isSessionActive());
    }

    @After
    public void endSession() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive());
    }

}