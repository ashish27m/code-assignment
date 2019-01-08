package com.singtel.codeassignment;

import org.junit.Test;

import com.singtel.codeassignment.models.Clownfish;

import static org.junit.Assert.assertEquals;

public class ClownfishTest {

    private Clownfish clownfish;

    public ClownfishTest() {
        clownfish = new Clownfish();
    }

    @Test
    public void testClownfishSize() {
        assertEquals("SMALL", clownfish.getSize());
    }

    @Test
    public void testClownfishColor() {
        assertEquals("ORANGE", clownfish.getColor());
    }

    @Test
    public void testMakeJoke() {
        assertEquals("Knock Knock...", clownfish.makeJokes());
    }
}
