package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.codeassignment.models.Cat;

public class CatTest {
	
	private Cat cat;

	public CatTest() {
		this.cat = new Cat();
	}

	@Test
	public void testWalk() {
		assertEquals("I am walking", cat.walk());
	}

	@Test
	public void testSing() {
		assertEquals("Meow", cat.sing());
	}

	@Test
	public void testFly() {
		assertEquals("I cannot fly", cat.fly());
	}

}
