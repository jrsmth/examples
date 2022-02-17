package com.jrsmiffy.examples.solidoop.oop;

public abstract class Animal {
    private String classification;
    private String diet;

    public Animal(String diet, String classification) {
        System.out.println(String.format("A %s eats %s", classification, diet));
    }

    public String getClassification() {
        return classification;
    }
}
