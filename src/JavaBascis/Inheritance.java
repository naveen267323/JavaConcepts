package JavaBascis;

class Parentiheritance1 {

	public void Parentmessage() {
		System.out.println("This dog can walk");
	}
}

class Childinheritance1 extends Parentiheritance1 {

	public void childmessage() {

		super.Parentmessage();
		System.out.println("This dog can dance");

	}

}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childinheritance1 Child = new Childinheritance1();
		Child.Parentmessage(); // calls inherited method from parent class.
//		Child.childmessage(); // just calling child method

	}

}
