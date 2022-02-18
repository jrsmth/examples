package com.jrsmiffy.examples.solidoop.solid.dependencyInversion;

public class BadWindows98Machine { // credit to https://github.com/eugenp/tutorials/

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public BadWindows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

}