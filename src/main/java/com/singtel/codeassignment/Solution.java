package com.singtel.codeassignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.singtel.codeassignment.behaviour.Animal;
import com.singtel.codeassignment.behaviour.Flyable;
import com.singtel.codeassignment.behaviour.Singable;
import com.singtel.codeassignment.behaviour.Swimmable;
import com.singtel.codeassignment.behaviour.Walkable;
import com.singtel.codeassignment.models.Bird;
import com.singtel.codeassignment.models.Butterfly;
import com.singtel.codeassignment.models.Cat;
import com.singtel.codeassignment.models.Chicken;
import com.singtel.codeassignment.models.Clownfish;
import com.singtel.codeassignment.models.Dog;
import com.singtel.codeassignment.models.Dolphin;
import com.singtel.codeassignment.models.Duck;
import com.singtel.codeassignment.models.Fish;
import com.singtel.codeassignment.models.Parrot;
import com.singtel.codeassignment.models.Rooster;
import com.singtel.codeassignment.models.Shark;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        
        Animal[] animals = new Animal[]{
                new Bird(), // Fly, Walk
                new Duck(), // Fly, Walk
                new Chicken(), // Walk
                new Rooster(), // Walk
                new Parrot(), // Fly, Walk
                new Fish(), // Swim
                new Shark(), // Swim
                new Clownfish(), // Swim
                new Dolphin(), // Swim
                // new Frog(), // Don't have a frog class.
                new Dog(), // Walk, Sound
                new Butterfly(), // Fly
                new Cat() // Walk, Sound
        };
        
        List<String> flyingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Flyable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> walkingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Walkable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> singingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Singable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        List<String> swimmingAnimals = Arrays
                .stream(animals)
                .filter((x) -> x instanceof Swimmable)
                .map((x) -> x.getClass().getSimpleName())
                .collect(Collectors.toList());

        System.out.println("List contains...");
        System.out.println(" -> " + flyingAnimals.size() + " flying animals (not all birds fly) " + flyingAnimals);
        System.out.println(" -> " + walkingAnimals.size() + " walking animals " + walkingAnimals);
        System.out.println(" -> " + singingAnimals.size() + " singing animals or animals that make sounds " + singingAnimals);
        System.out.println(" -> " + swimmingAnimals.size() + " swimming animals " + swimmingAnimals);
    }
}
