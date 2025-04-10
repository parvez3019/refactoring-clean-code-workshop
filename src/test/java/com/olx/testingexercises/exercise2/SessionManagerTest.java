package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionManagerTest {
    public SessionManager sessionManager;

    @BeforeEach
    void setUp() {
        sessionManager = new SessionManager();
    }

    @Test
    void startSession() {
        sessionManager.startSession();

        assertEquals(true, sessionManager.isSessionActive());
    }

    @Test
    void endSession() {
        sessionManager.endSession();

        assertEquals(false, sessionManager.isSessionActive());
    }

    @Test
    void isSessionActive() {
        assertEquals(false, sessionManager.isSessionActive());
    }

    @Test
    void isSessionInactive() {
        sessionManager.startSession();
        assertEquals(true, sessionManager.isSessionActive());
    }
}