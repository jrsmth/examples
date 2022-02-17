package com.jrsmiffy.examples.solidoop.oop;

public class Horse extends Herbivore implements Swim {

    private static String classification = "Horse";
    private Human owner;
    private String name;

    public Horse(String name, Human owner) {
        super(classification);
        this.name = name;
        this.owner = owner;
    }

    public void swishMane() {
        System.out.println("All Horses have a mane");
    }

    @Override
    public void digest() {
        System.out.println("Horses have 1 stomach for digesting food");
    }

    @Override
    public void swim() {
        System.out.println("Horses don't swim very well");
        Swim.drown(classification);
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
