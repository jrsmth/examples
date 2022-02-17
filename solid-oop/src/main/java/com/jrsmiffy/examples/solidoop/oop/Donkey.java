package com.jrsmiffy.examples.solidoop.oop;

public class Donkey extends Horse{


    public Donkey(String name, Human owner) {
        super(name, owner);
    }

    @Override
    public void swishMane() {
        System.out.println("Donkeys have a short mane");
    }
}
