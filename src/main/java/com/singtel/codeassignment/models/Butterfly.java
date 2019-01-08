package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Flyable;

public class Butterfly implements Flyable {
    @Override
    public String fly() {
        return "I am flying";
    }
}
