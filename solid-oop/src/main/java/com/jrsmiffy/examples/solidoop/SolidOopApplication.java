package com.jrsmiffy.examples.solidoop;

import com.jrsmiffy.examples.solidoop.oop.Cow;
import com.jrsmiffy.examples.solidoop.oop.Donkey;
import com.jrsmiffy.examples.solidoop.oop.Horse;
import com.jrsmiffy.examples.solidoop.oop.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidOopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidOopApplication.class, args);

		executeOOPConcepts();

		executeSOLIDConcepts();

	}

	/** Execute OOP Concepts */
	private static void executeOOPConcepts(){

		Human james = new Human("James", "London, UK");
		Horse hubert = new Horse("Hubert", james);
		Cow carl = new Cow("Carl", james);
		Donkey dave = new Donkey("Dave", james);

		james.swim();
		james.swim(3); // compile-time polymorphism, method overloading
		hubert.swim();

		hubert.digest();
		carl.digest();

		hubert.swishMane();
		dave.swishMane(); // runtime polymorphism, method overriding



		/** OOP Concepts */

		// Inheritance: Horse() inherits its diet from Herbivore() - Horse "IS-A" Herbivore

		// Abstraction: Herbivore() is an abstract class, hiding its complexities and providing a simpler interface to Horse()
		// a Herbivore() is not an animal in its own right and so cannot be instantiated
		// it is a partial representation of a real-world object (an abstract idea)

		// Composition: Horse() "HAS-A" Owner(), which is a class in its own right.

		// Interfaces: interfaces give us abstraction (partially defined representations of abstract ideas),
		// ...polymorphism (different processing depending on the input) and multiple inheritance
		// The Swim() interface defines what our Horse() and Human() "CAN-DO"

		// Polymorphism: Horse() and Donkey() both can swishMane(), an example of method overriding (runtime polymorphism)
		// method overloading (compile-time polymorphism) is used in Human(), where we have two implementations of the swim() method
		// the implementation that gets called is dependent on the parameter used

		// Encapsulation: I have used encapsulation in the Horse() class, to prevent the diet field from being changed.

	}

	/** Execute OOP Concepts */
	private static void executeSOLIDConcepts(){


		/** SOLID Concepts */

		// Single Responsibility: A class should be responsible for one thing only and only have one reason to change


	}

}
