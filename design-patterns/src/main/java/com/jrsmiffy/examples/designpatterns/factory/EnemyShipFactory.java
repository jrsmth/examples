package com.jrsmiffy.examples.designpatterns.factory;

import com.jrsmiffy.examples.designpatterns.BigUFOEnemyShip;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String enemyShipType){

        EnemyShip newShip = null;

        switch(enemyShipType){
            case "ufo":
                newShip = new UFOEnemyShip();
                break;
            case "rocket":
                newShip = new RocketEnemyShip();
                break;
            case "ufobig":
                newShip = new BigUFOEnemyShip();
                break;
        }

        return newShip;

    }
}
