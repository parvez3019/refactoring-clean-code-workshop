package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionManagerTest {
    SessionManager obj = new SessionManager();

    @BeforeEach
    void startSession() {
        obj.startSession();
    }

    @Test
    void isSessionActive() {
        assertTrue(obj.isSessionActive());
    }

    @AfterEach
    void endSession() {
        obj.endSession();
    }
}