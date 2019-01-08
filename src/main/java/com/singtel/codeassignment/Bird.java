package com.singtel.codeassignment;

public class Bird implements Animal {
	
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
