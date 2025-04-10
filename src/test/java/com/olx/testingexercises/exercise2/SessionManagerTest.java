package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionManagerTest {
    private SessionManager sessionManager;
    @BeforeEach
    void setUp(){
        sessionManager = new SessionManager();
    }

    @Test
    void startSession() {
        Boolean isActive = sessionManager.isSessionActive();
        assertEquals(false,isActive);
    }

    @Test
    void startSessionFail() {
        Boolean isActive = sessionManager.isSessionActive();
        assertEquals(true,isActive);
    }

    @Test
    void endSession() {
        Boolean isActive = sessionManager.isSessionActive();
        assertEquals(true,isActive);
    }

    @Test
    void endSessionFailed() {
        Boolean isActive = sessionManager.isSessionActive();
        assertEquals(false,isActive);
    }

    @AfterEach
    void cleanUp(){
        sessionManager = null;
    }
}