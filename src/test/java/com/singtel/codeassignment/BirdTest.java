package com.singtel.codeassignment;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.codeassignment.Bird;

public class BirdTest {

	private Bird bird;

	public BirdTest() {
		this.bird = new Bird();
	}

	@Test
	public void testWalk() {
		assertEquals("I am walking", bird.walk());
	}

	@Test
	public void testSing() {
		assertEquals("I am singing", bird.sing());
	}

	@Test
	public void testFly() {
		assertEquals("I am flying", bird.fly());
	}

}
