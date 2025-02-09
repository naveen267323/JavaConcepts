package JavaBascis;

class Dog {
	String name;

	// Constructor - Constructor uses the same name as class - in this example Dog
	// is a class and Dog is constructor name
	// Constructor will not have return type
	// If you do not pass any parameter in the constructor then it is called Default
	// constructor
	public Dog() {
		name = "Bull dog";
	}

	public void displaymessage() {
		System.out.println("Dog name " + name);

	}

}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog mydog = new Dog();
		mydog.displaymessage();

	}

}
