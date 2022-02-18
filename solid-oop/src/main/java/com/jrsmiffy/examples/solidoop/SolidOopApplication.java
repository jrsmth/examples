package com.jrsmiffy.examples.solidoop;

import com.jrsmiffy.examples.solidoop.oop.Cow;
import com.jrsmiffy.examples.solidoop.oop.Donkey;
import com.jrsmiffy.examples.solidoop.oop.Horse;
import com.jrsmiffy.examples.solidoop.oop.Human;
import com.jrsmiffy.examples.solidoop.solid.dependencyInversion.BadWindows98Machine;
import com.jrsmiffy.examples.solidoop.solid.dependencyInversion.GoodWindows98Machine;
import com.jrsmiffy.examples.solidoop.solid.dependencyInversion.Monitor;
import com.jrsmiffy.examples.solidoop.solid.dependencyInversion.StandardKeyboard;
import com.jrsmiffy.examples.solidoop.solid.interfaceSegregation.CrazyPerson;
import com.jrsmiffy.examples.solidoop.solid.interfaceSegregation.Person;
import com.jrsmiffy.examples.solidoop.solid.listovSubstitution.ElectricCar;
import com.jrsmiffy.examples.solidoop.solid.listovSubstitution.MotorCar;
import com.jrsmiffy.examples.solidoop.solid.openClose.Guitar;
import com.jrsmiffy.examples.solidoop.solid.openClose.SuperCoolGuitarWithFlames;
import com.jrsmiffy.examples.solidoop.solid.singleResponsibility.BadBook;
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

		System.out.println("OOP:");

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

		System.out.println("SOLID:");

		BadBook badBook = new BadBook("James' Tale", "James Smith", "3.141592");
		badBook.printTextToConsole(); // this method is unrelated to the book and add complexity that we don't need

		Guitar guitar = new Guitar("Fender", "Jaguar", 10);
		SuperCoolGuitarWithFlames superCoolGuitarWithFlames = new SuperCoolGuitarWithFlames("Orange Flames");
		// Instead of adding a flameColour field to Guitar(), we can extend it with a subclass - this way we don't risky adding bugs

		MotorCar motorCar = new MotorCar();
		motorCar.turnOnEngine();
		ElectricCar electricCar = new ElectricCar();
		electricCar.turnOnEngine(); // electric cars don't have engines, thus we are violating the Listov Substitution principle...
			// ... as ElectricCar does not accurately replace its parent / base class

		Person person = new Person();
		person.petTheBear(); // only a crazy person would pet a bear, we don't actually want to implement this method
		CrazyPerson crazyPerson = new CrazyPerson();
		crazyPerson.petTheBear(); // by splitting up the large BearKeeper interface, we have more control

		new GoodWindows98Machine(new StandardKeyboard(), new Monitor());
		new BadWindows98Machine(); // In the Bad example, we have tightly coupled the Windows98Machine() with the Monitor() and Keyboard()
		// In the Good example, we have decoupled them by using the 'this' keyword and providing the Monitor() and Keyboard() outside of the...
			// ...Windows98Machine().


		/** SOLID Concepts */

		// Single Responsibility: a class should be responsible for one thing only and only have one reason to change
			// the printTextToConsole() method should be moved into a separate class because the it is unrelated to the book
				// if we needed to change the print formatting, we could break the Book class

		// Open Close: a class should remain closed to modification but open to extension
			// Guitar() is extended when we add flameColor to its child class but we avoid modifying the existing logic

		// Listov Substitution: a child class should be substitutable for its base class
			// MotorCar() can replace Car() but ElectricCar() cannot do this accurately, hence we violate this principle

		// Interface Segregation: split up large interfaces into smaller ones so that a class only implements the methods that it needs
			// when Person() implements BearKeeper it gains petBear(), which it doesn't want to implement
				// it makes sense to split the BearKeeper() into smaller interfaces so we can just implement the methods that we need

		// Dependency Inversion: decouple your high-level modules and low-level modules by using interfaces (abstractions) between them
			// BadWindows98Machine() is tightly coupled with Monitor() and Keyboard(), whereas GoodWindows98Machine() is not

	}

}
