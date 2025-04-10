package com.olx.testingexercises.exercise2;

//import com.olx.testing.lesson3.Account;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;
public class SessionManagerTest {

    private SessionManager sessionManager;

    @BeforeEach
    public void startSession() {
        sessionManager = new SessionManager();
        sessionManager.startSession();
    }

    @AfterEach
    public void endSession() {
        sessionManager.endSession();
    }

    @Test
    public void testSessionIsActiveAfterStart() {
        assertTrue(sessionManager.isSessionActive());
    }
    @Test
    public void testSessionIsInactiveAfterEnd() {
        sessionManager.endSession();
        assertFalse(sessionManager.isSessionActive());
    }
    @Test
    public void testSessionStartsAutomaticallyInBeforeEach() {
        assertTrue(sessionManager.isSessionActive());
    }
}