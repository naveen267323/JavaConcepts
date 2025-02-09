package JavaBascis;

class Cat {
	String name;

	public Cat(String name) {
		this.name = name; // whenever class variable and local variable is same then we need to different
							// between the class and local
							// variable using this keyword.
							// In this example class cat has the variable name and the local variable in the
							// constructor is also name
	}

	public Cat() {
		name = "Cat";
	}

	public void displaymessage() {
		System.out.println("This is a " + name);
	}

}

public class ConstructorusingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat ct = new Cat("perian cat 1");
		ct.displaymessage();

		Cat ct1 = new Cat("persian cat 2");
		ct1.displaymessage();

		Cat ct3 = new Cat();
		ct3.displaymessage();

	}

}
