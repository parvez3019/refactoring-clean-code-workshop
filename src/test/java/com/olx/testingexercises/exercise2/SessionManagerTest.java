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

        assertTrue(sessionManager.isSessionActive(),"session should be active after setup");
    }

    @AfterEach
    void tearDown() {
        sessionManager.endSession();

        assertFalse(sessionManager.isSessionActive(), "Session should be inactive after tear down");
    }

    @Test
    void testSessionActiveAtBeginning() {
        assertTrue(sessionManager.isSessionActive());
    }

    @Test
    void testSessionInactiveAtEnd() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive());
    }


}