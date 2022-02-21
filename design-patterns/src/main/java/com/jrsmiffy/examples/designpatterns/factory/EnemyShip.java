package com.jrsmiffy.examples.designpatterns.factory;

import lombok.Data;

@Data
public abstract class EnemyShip {

    private String name;
    private double damage;

    public void followHeroShip(){
        System.out.println(name + "is following the hero ship");
    }

    public void display(){
        System.out.println(name + " is on the screen");
    }

    public void attack(){
        System.out.println(String.format("%s is shooting and does %s damage", name, damage));
    }

}
