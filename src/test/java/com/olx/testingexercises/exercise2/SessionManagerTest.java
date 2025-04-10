package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionManagerTest {
    SessionManager sessionManager;

    @BeforeEach
    public void setUp() {
        sessionManager = new SessionManager();
    }

    @AfterEach
    public void tearDown() {
        sessionManager = null;
    }

    @Test
    public void sessionIsActiveAtStart() {
        sessionManager.startSession();
        assertTrue(sessionManager.isSessionActive());
    }

    @Test
    public void sessionIsInactiveAtEnd() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive());
    }
}