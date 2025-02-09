package JavaBascis;

abstract class shapes {
	abstract void draw(); // abstract method
}

class write extends shapes {
	public void draw() {
		System.out.println("This is abstract concept using Abstract class and using extend keyword");
	}
}

public class AbstractionusingAbstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		write wr = new write();
		wr.draw();
		
	}

}
