package com.jrsmiffy.examples.designpatterns;

import com.jrsmiffy.examples.designpatterns.factory.EnemyShip;
import com.jrsmiffy.examples.designpatterns.factory.EnemyShipFactory;
import com.jrsmiffy.examples.designpatterns.factory.UFOEnemyShip;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) { // use mvn spring-boot:run
		SpringApplication.run(DesignPatternsApplication.class, args);

		/** Factory Pattern */
		// Allows us to create our objects without knowing the exact class that we want to use at runtime
            // as long as these classes exist in the same hierarchy
                // it also allows us to encapsulate the object creation code in one place

        // old way, static - choosing the enemy ship type is not dynamic
		EnemyShip enemyShip1 = new UFOEnemyShip();
		doEnemyShipStuff(enemyShip1);

		// using the factory pattern allows us to select the class type dynamically
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemyShip2 = null;
        Scanner userInput = new Scanner(System.in);
        enemyShip2 = enemyShipFactory.makeEnemyShip(userInput.nextLine());
        doEnemyShipStuff(enemyShip2);

	}


	public static void doEnemyShipStuff(EnemyShip enemyShip){
        enemyShip.display();
        enemyShip.followHeroShip();
		enemyShip.attack();
	}

}
