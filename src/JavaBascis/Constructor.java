package JavaBascis;

public class constructor {

//default constructor	
	constructor() {
		System.out.println("this is a message from constructor");
	}

//parameterized constructor	
	constructor(int x) {
	//	x = 10;
		System.out.println("this is a message from parameterized constructor  " + x);
	}

	void displaymessage() {
		System.out.println("this is a displaymessage method and it can be called in both the constuctor ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructor con = new constructor(); // calling default constuctor is called
		con.displaymessage();
		constructor con1 = new constructor(10); // calling parameter constructor is called
		con1.displaymessage();
	}

}
