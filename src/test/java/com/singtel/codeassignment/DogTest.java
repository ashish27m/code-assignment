package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {
	
	private Dog dog;

	public DogTest() {
		this.dog = new Dog();
	}

	@Test
	public void testWalk() {
		assertEquals("I am walking", dog.walk());
	}

	@Test
	public void testSing() {
		assertEquals("Woof, woof", dog.sing());
	}

	@Test
	public void testFly() {
		assertEquals("I cannot fly", dog.fly());
	}

}
