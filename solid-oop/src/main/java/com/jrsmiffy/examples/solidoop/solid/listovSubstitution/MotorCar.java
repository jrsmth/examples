package com.jrsmiffy.examples.solidoop.solid.listovSubstitution;

import lombok.Data;

@Data
public class MotorCar implements Car { // credit to https://github.com/eugenp/tutorials/

    private Engine engine = new Engine();

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.accelerate(5);
    }
}
