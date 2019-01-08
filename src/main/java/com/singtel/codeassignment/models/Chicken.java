package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Singable;
import com.singtel.codeassignment.behaviour.Walkable;

public class Chicken implements Singable, Walkable {
    @Override
    public String sing() {
        return "Cluck, cluck";
    }

    @Override
    public String walk() {
        return "I cannot fly";
    }
}