package JavaBascis;

class message {

	// Method 1 - with String Arguments/Parameter

	public void displaymessage(String name) {

		System.out.println("Display message " + name);
	}

	// Method 2 - - with integer Arguments/Parameter
	public void displaymessage(int age) {

		System.out.println("Display age " + age);
	}

	// Method 3 - - with String and integer Arguments/Parameter
	public void displaymessage(String name, int age) {

		System.out.println("Display message " + name + +age);
	}

}

public class Polymorphismoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		message msg = new message();

		
		// Calling overloaded methods
		//The method to call is resolved at compile time based on the arguments passed.
		//The displaymessage() method is overloaded with different parameters (one takes a String, one takes an int, and one takes both).
		
		msg.displaymessage("Hello");
		msg.displaymessage(37);
		msg.displaymessage("Naveen ", 38);
	}

}
