package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Swimmable;

public class Duck extends Bird implements Swimmable {
    @Override
    public String sing() {
        return "Quack, quack";
    }
    
    @Override
    public String swim() {
        return "I am swimming";
    }
}
