package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Walkable;

public class Animal implements Walkable{

	@Override
	public String walk() {
		return "I am walking";
	}

}
