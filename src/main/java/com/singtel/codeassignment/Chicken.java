package com.singtel.codeassignment;

public class Chicken extends Bird {
    @Override
    public String sing() {
        return "Cluck, cluck";
    }

    @Override
    public String fly() {
        return "I cannot fly";
    }
}