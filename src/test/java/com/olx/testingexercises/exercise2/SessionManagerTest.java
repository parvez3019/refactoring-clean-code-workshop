package com.olx.testingexercises.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionManagerTest {
    private SessionManager sessionManager;
    @BeforeEach
    public void setUp() {
        sessionManager = new SessionManager();
        sessionManager.startSession();
    }

}