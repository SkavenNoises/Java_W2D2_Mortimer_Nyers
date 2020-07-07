
/*
#########################################################
Exercise 1
#########################################################
*/
abstract class Dog {
	// Abstract method to display how much this dog eats, specific to child class
	public abstract void eats();

	// Standard method to bark
	public void bark() {
		System.out.println("Bark Bark");
	}
}

// Inheriting the super abstract class
class SpringerSpaniel extends Dog {
	public void eats() {
		System.out.println("These dogs eat 25g of food a day");
	}
}


/*
#########################################################
Exercise 2
#########################################################
*/
interface Animal {
	void speak();
	void eat();
}

class Cat implements Animal {
	public void speak() {
		System.out.println("Meow");
	}

	public void eat() {
		System.out.println("Cat has eaten 25g of food");
	}
}

/*
#########################################################
Exercise 3
#########################################################
*/
interface VehicleControls {
	public void move(int i);
	public void applyBreaks(int i);
}

class Bike implements VehicleControls {
	public void move(int i) {
		System.out.println("Bike has travelled " + i + " kilometers");
	}

	public void applyBreaks(int i) {
		System.out.println("Bike has stopped with brakes across " + i + " meters");
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("Exercise 1 Output");
		SpringerSpaniel mDog = new SpringerSpaniel();
		mDog.eats();
		mDog.bark();

		System.out.println("");

		System.out.println("Exercise 2 Output");
		Cat mCat = new Cat();
		mCat.eat();
		mCat.speak();

		System.out.println("");

		System.out.println("Exercise 3 Output");
		Bike mBike = new Bike();
		mBike.move(25);
		mBike.applyBreaks(2);
	}
}