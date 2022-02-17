package com.jrsmiffy.examples.solidoop.oop;

public class Cow extends Herbivore {

    private static String classification = "Cow";
    private Human owner;
    private String name;

    public Cow(String name, Human owner) {
        super(classification);
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void digest() {
        System.out.println("Cows have 5 stomachs for digesting food");
    }
}
