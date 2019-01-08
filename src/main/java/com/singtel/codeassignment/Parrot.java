package com.singtel.codeassignment;

import com.singtel.codeassignment.behaviour.Singable;

public class Parrot extends Bird {

    private String song;

    private Parrot() {
        this.song = super.sing();
    }

    private Parrot(String song) {
        this.song = song;
    }

    public static Parrot getParrotThatLivesWith(Singable singable) {
        if (singable == null) {
            return new Parrot();
        } else {
            return new Parrot(singable.sing());
        }

    }

    @Override
    public String sing() {
        return song;
    }

}