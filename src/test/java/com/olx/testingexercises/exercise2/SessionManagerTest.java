package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionManagerTest {

    @Test
    void startSession() {

    }

    @Test
    void endSession() {
    }

    @Test
    void isSessionActive() {
        //arrange
        SessionManager sessionManger=new SessionManager();
        //act
        boolean isActive=sessionManger.isSessionActive();
        //assert
        assertFalse(isActive);
    }
}