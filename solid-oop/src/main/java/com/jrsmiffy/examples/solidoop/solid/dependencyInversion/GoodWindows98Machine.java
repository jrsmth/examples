package com.jrsmiffy.examples.solidoop.solid.dependencyInversion;

public class GoodWindows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public GoodWindows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}