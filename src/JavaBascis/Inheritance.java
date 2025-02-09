package JavaBascis;

class Parentiheritance1 {

	public void Parentmessage() {
		System.out.println("This dog can walk");
	}
}

class Childinheritance1 extends Parentiheritance1 {

	public void childmessage() {

		System.out.println("This dog can dance");

 	}

}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childinheritance1 Child = new Childinheritance1();
		Child.childmessage();
		Child.Parentmessage();
		
		
		
		Parentiheritance1 Parent = new Parentiheritance1();
		Parent.Parentmessage();
		

	}

}
