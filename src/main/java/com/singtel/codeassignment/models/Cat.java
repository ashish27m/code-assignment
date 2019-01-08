package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Flyable;
import com.singtel.codeassignment.behaviour.Singable;
import com.singtel.codeassignment.behaviour.Walkable;

public class Cat implements Walkable, Flyable, Singable {
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