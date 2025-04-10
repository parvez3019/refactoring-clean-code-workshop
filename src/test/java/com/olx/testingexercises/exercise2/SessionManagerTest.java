package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SessionManagerTest {

    private SessionManager sessionManager;

    @BeforeEach
    void setUp() {
        sessionManager = new SessionManager();
        sessionManager.startSession();
    }
    @Test
    void startSession() {
        boolean expectedStatus = true;

        boolean actualStatus = sessionManager.isSessionActive();

        assertEquals(expectedStatus, actualStatus);
    }

    @Test
    void endSession() {
        boolean expectedStatus = false;

        sessionManager.endSession();
        boolean actualStatus = sessionManager.isSessionActive();

        assertEquals(expectedStatus, actualStatus);
    }

    @AfterEach
    void tearDown() {
        sessionManager.endSession();
    }
}