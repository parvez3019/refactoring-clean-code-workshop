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
    }

    @Test
    void isSessionActive() {
    }
}