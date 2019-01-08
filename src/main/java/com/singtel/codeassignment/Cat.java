package com.singtel.codeassignment;

public class Cat implements Animal {
    @Override
    public String walk() {
        return "I am walking";
    }

    @Override
    public String fly() {
        return "I cannot fly";
    }

    @Override
    public String sing() {
        return "Meow";
    }
}