package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChickenTest {
	
	private Chicken chicken;

    public ChickenTest() {
        this.chicken = new Chicken();
    }

    @Test
    public void testSing() {
        assertEquals("Cluck, cluck", chicken.sing());
    }

    @Test
    public void testFly() {
        assertEquals("I cannot fly", chicken.fly());
    }

}
