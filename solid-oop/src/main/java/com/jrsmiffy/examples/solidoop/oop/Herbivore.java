package com.jrsmiffy.examples.solidoop.oop;

public abstract class Herbivore extends Animal{
    private static String diet = "plants";

    Herbivore(String classification){
        super(diet, classification);
    }

    public void digest(){
        System.out.println("All herbivores have a stomach for digestion");
    }

}
