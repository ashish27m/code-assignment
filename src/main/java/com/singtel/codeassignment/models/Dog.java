package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Singable;
import com.singtel.codeassignment.behaviour.Walkable;

public class Dog implements Walkable, Singable {
	@Override
	public String walk() {
		return "I am walking";
	}

	@Override
	public String sing() {
		return "Woof, woof";
	}
}
