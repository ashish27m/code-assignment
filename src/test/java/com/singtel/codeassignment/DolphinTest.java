package com.singtel.codeassignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DolphinTest {

    private Dolphin dolphin;

    public DolphinTest() {
        this.dolphin = new Dolphin();
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", dolphin.swim());
    }
}
