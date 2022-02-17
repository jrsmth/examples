package com.jrsmiffy.examples.solidoop.oop;

public abstract class Omnivore extends Animal {
    private static String diet = "plants and meat";

    Omnivore(String classification){
        super(diet, classification);
    }

}
