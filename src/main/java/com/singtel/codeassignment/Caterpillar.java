package com.singtel.codeassignment;

import com.singtel.codeassignment.behaviour.Walkable;

public class Caterpillar implements Walkable {
    @Override
    public String walk() {
        return "I am crawling";
    }

    public Butterfly metamorphize() {
        return new Butterfly();
    }
}
