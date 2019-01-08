package com.singtel.codeassignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.codeassignment.models.Cat;
import com.singtel.codeassignment.models.Dog;
import com.singtel.codeassignment.models.Parrot;
import com.singtel.codeassignment.models.Rooster;

public class ParrotTest {

	@Test
	public void testParrotLivingWithDogs() {
		Parrot parrotThatLivesWithDogs = new Parrot(new Dog());
		assertEquals("Woof, woof", parrotThatLivesWithDogs.sing());
	}

	@Test
	public void testParrotLivingWithCats() {
		Parrot parrotThatLivesWithCats = new Parrot(new Cat());
		assertEquals("Meow", parrotThatLivesWithCats.sing());
	}

	@Test
	public void testParrotLivingWithRooster() {
		Parrot parrotThatLivesWithRooster = new Parrot(new Rooster());
		assertEquals("Cock-a-doodle-doo", parrotThatLivesWithRooster.sing());
	}

}
