package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.codeassignment.models.Fish;

public class FishTest {

	private Fish fish;

    public FishTest() {
        this.fish = new Fish();
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", fish.swim());
    }
}
