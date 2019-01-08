package com.singtel.codeassignment;

import org.junit.Test;

import com.singtel.codeassignment.models.Butterfly;

import static org.junit.Assert.assertEquals;

public class ButterflyTest {

    private Butterfly butterfly;

    public ButterflyTest() {
        this.butterfly = new Butterfly();
    }

    @Test
    public void testFly() {
        assertEquals("I am flying", butterfly.fly());
    }


}