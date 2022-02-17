package com.jrsmiffy.examples.solidoop.oop;

public class Human extends Omnivore implements Swim {
    private static String classification = "Human";
    private String name;
    private String address;

    public Human(String name, String address) {
        super(classification);
        this.name = name;
        this.address = address;
    }

    @Override
    public void swim() {
        System.out.println(String.format("The human called %s is swimming at a rate of %s knots", name, swimSpeed));
    }

    public void swim(int swimSpeed){
        System.out.println(String.format("The human called %s is swimming at a rate of %s knots", name, swimSpeed));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
