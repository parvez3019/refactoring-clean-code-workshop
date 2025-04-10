package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionManagerTest {

    @Test
    void startSession() {
        SessionManager sessionManager = new SessionManager();
        sessionManager.startSession();
    }

    @Test
    void endSession() {
        SessionManager sessionManager = new SessionManager();
        sessionManager.endSession();
    }

    @Test
    void isSessionActive() {
        SessionManager sessionManager = new SessionManager();
        assertFalse(sessionManager.isSessionActive());
        sessionManager.startSession();
        assertTrue(sessionManager.isSessionActive());
        sessionManager.endSession();
    }
}