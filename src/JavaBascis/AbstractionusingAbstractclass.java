package JavaBascis;

abstract class Bank1 {
	 abstract void ROI(); // abstract method
}
//abstract uses a keyword called abstract
//abstract method will not have implementation
//we cannot call the abstract method in the main method becasue there is not implementation in the abstract class

class SBI1 extends Bank1{
	// Implementing the abstract method
	void ROI() {
		System.out.println("This is abstract concept using Abstract class and Abstract method using extend keyword");
	}
}

public class AbstractionusingAbstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI1 sb = new SBI1();
		sb.ROI();

	
		
	}

}
