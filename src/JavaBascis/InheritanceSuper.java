package JavaBascis;

class Parentinheri {

	String name = "Parent";

	public void Parentmessage() {
		System.out.println("This dog can walk");
	}

}

class Childinheri extends Parentinheri {

	String name = "Child";

	public void Childmessage() {

		System.out.println("This dog can dance");

		System.out.println("Message from " + super.name); // Super Keyword is used to access the parent variable in the child class
		System.out.println("Message from " + name);

		super.Parentmessage(); // Super Keyword is used to call the parent method in the child class/method

	}

}

public class InheritanceSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childinheri ch = new Childinheri();
		ch.Parentmessage();
		ch.Childmessage();

	}

}

// super keyword is used to call the parent variable from the parentinheritance
// class
// super keyword cannot be used if the there is static keyword in the method.
// super keyword has to used when the parentinheritance class and
// childinheritance class both using the same variable
// in the string - in this code variable name - name is being used in both
// parentinheritance class and childinheritance class
// so when both parentinheritance class and childinheritance class using the
// same variable name in the string then to access the
// parent variable string we need to use super keyword below.
// There is keyword public in the class because both the parentinheritance class
// and childinheritance class are in the same program
