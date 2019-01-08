package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Swimmable;

public class Fish implements Swimmable {
    @Override
    public String swim() {
        return "I am swimming";
    }
}
