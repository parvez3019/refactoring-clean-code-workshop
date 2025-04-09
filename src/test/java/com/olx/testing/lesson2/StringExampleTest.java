package com.olx.testing.lesson2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExampleTest {
    StringExample util;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Here in BeforeAll method");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Here in tearDownClass method");
    }

    @BeforeEach
    public void setUp() throws Exception {
        util = new StringExample();
        System.out.println("Here in setup method");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("Here in teardown method");
    }


    @Test
    public void testReverse() {
        assertEquals("cba", util.reverse("abc"));
    }

    @Test
    public void testReverseNullInput() {
        assertThrows(InvalidStringException.class, () -> util.reverse(null));
    }

}