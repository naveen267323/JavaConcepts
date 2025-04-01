package JavaBascis;

// This a example of calling one constructor from another constructor using this()

public class constructor_this {

	// default constructor
	constructor_this() {
		this(10); // this will called parameterized constructor
		System.out.println("this is a message from constructor");
	}

	// parameterized constructor
	constructor_this(int x) {
		System.out.println("this is a message from parameterized constructor  " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calling default constuctor but this will call parameterized constructor in
		// the output becasue we have used this()
		// in the default constructor

		constructor_this con = new constructor_this();
	}

}
