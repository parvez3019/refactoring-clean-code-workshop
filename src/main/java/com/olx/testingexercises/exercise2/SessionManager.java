package com.olx.testingexercises.exercise2;

public class SessionManager {
    private boolean active;

    public void startSession() {

        active = true;
    }

    public void endSession() {

        active = false;
    }

    public boolean isSessionActive() {

        return active;
    }
}

/*

Tasks:
- Use @BeforeEach to always start a session before tests.
- Use @AfterEach to end the session.
- Write tests to assert that session is active at the beginning and inactive at the end.

*/

