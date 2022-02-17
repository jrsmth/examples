package com.jrsmiffy.examples.solidoop;

import com.jrsmiffy.examples.solidoop.oop.Cow;
import com.jrsmiffy.examples.solidoop.oop.Horse;
import com.jrsmiffy.examples.solidoop.oop.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidOopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidOopApplication.class, args);

		Human james = new Human("James", "London, UK");
		Horse hubert = new Horse("Hubert", james);
		Cow carl = new Cow("Carl", james);

		james.swim();
		hubert.swim();

		hubert.digest();
		carl.digest();

		/** OOP Concepts */

		// Inheritance: Horse() inherits its diet from Herbivore() - Horse "IS-A" Herbivore

		// Abstraction: Herbivore() is an abstract class, hiding its complexities and providing a simpler interface to Horse()
			// a Herbivore() is not an animal in its own right and so cannot be instantiated
				// it is a partial representation of a real-world object (an abstract idea)

		// Composition: Horse() "HAS-A" Owner(), which is a class in its own right.

		// Interfaces: interfaces give us abstraction (partially defined representations of abstract ideas),
			// ...polymorphism (different processing depending on the input) and multiple inheritance
				// The Swim() interface defines what our Horse() and Human() "CAN-DO"

		// Polymorphism:

		// Encapsulation:

	}

}
