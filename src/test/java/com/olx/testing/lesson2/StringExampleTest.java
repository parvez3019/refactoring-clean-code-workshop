package com.olx.testing.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExampleTest {

    @Test
    public void testReverse() {
        StringExample util = new StringExample();
        assertEquals("cba", util.reverse("abc"));
    }

    @Test
    public void testReverseNullInput() {
        StringExample util = new StringExample();
        assertThrows(IllegalArgumentException.class, () -> util.reverse(null));
    }

}