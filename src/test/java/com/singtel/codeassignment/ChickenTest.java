package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.codeassignment.models.Chicken;

public class ChickenTest {
	
	private Chicken chicken;

    public ChickenTest() {
        this.chicken = new Chicken();
    }

    @Test
    public void testSing() {
        assertEquals("Cluck, cluck", chicken.sing());
    }

}
