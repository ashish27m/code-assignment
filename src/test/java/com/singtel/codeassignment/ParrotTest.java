package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParrotTest {

	@Test
	public void testParrotLivingWithDogs() {
		Parrot parrotThatLivesWithDogs = Parrot.getParrotThatLivesWith(new Dog());
		assertEquals("Woof, woof", parrotThatLivesWithDogs.sing());
	}

	@Test
	public void testParrotLivingWithCats() {
		Parrot parrotThatLivesWithCats = Parrot.getParrotThatLivesWith(new Cat());
		assertEquals("Meow", parrotThatLivesWithCats.sing());
	}

	@Test
	public void testParrotLivingWithRooster() {
		Parrot parrotThatLivesWithRooster = Parrot.getParrotThatLivesWith(new Rooster());
		assertEquals("Cock-a-doodle-doo", parrotThatLivesWithRooster.sing());
	}

}
