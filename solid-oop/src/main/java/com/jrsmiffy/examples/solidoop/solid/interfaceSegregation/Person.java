package com.jrsmiffy.examples.solidoop.solid.interfaceSegregation;

public class Person implements BearKeeper { // should only implement BearFeeder and BearWasher

    @Override
    public void washTheBear() {

    }

    @Override
    public void feedTheBear() {

    }

    @Override // we are not a CrazyPerson() and so do not wish to implement this method,
    // the BearKeeper interface should be split up into BearFeeder(), BearWasher() and BearPetter()
    // Then we could implement the methods that we actually want!
    public void petTheBear() {

    }
}
