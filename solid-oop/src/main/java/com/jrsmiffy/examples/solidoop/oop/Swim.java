package com.jrsmiffy.examples.solidoop.oop;

public interface Swim {

    int swimSpeed = 2;

    void swim();

    static void drown(String classification){
        System.out.println(String.format("The %s is drowning!", classification));
    }

}
