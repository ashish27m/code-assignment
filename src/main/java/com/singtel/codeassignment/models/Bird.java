package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Flyable;
import com.singtel.codeassignment.behaviour.Singable;
import com.singtel.codeassignment.behaviour.Walkable;

public class Bird implements Flyable, Walkable, Singable {
	
	@Override
    public String fly() {
        return "I am flying";
    }

	@Override
	public String walk() {
		return "I am walking";
	}

	@Override
	public String sing() {
		return "I am singing";
	}
}
