package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.codeassignment.models.Rooster;

public class RoosterTest {
	
	private Rooster rooster;

    public RoosterTest() {
        this.rooster = new Rooster();
    }

    @Test
    public void testSing() {
        assertEquals("Cock-a-doodle-doo", rooster.sing());
    }

}
