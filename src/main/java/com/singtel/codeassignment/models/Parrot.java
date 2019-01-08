package com.singtel.codeassignment.models;

import com.singtel.codeassignment.behaviour.Singable;

public class Parrot extends Bird {

	private String song;

    public Parrot() {
        this.song = super.sing();
    }

    public Parrot(Singable animalThatMakesSound) {
        this.song = animalThatMakesSound.sing();
    }

    @Override
    public String sing() {
        return song;
    }
}