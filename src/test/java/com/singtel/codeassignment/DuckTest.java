package com.singtel.codeassignment;

import org.junit.Test;

import com.singtel.codeassignment.models.Duck;

import static org.junit.Assert.assertEquals;

public class DuckTest {

    private Duck duck;

    public DuckTest() {
        this.duck = new Duck();
    }

    @Test
    public void testSing() {
        assertEquals("Quack, quack", duck.sing());
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", duck.swim());
    }
}
