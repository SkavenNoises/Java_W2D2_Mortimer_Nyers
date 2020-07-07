
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
######################################################
Exercise 3
#########################################################
*/



public class Main {
	public static void main(String[] args) {
		SpringerSpaniel mDog = new SpringerSpaniel();
		mDog.eats();
		mDog.bark();

		Cat mCat = new Cat();
		mCat.eat();
		mCat.speak();
	}
}