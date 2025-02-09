package JavaBascis;

//Bank is a parent class having method as ROI

class Bank {

	public void ROI() {
		System.out.println("ROI from Bank");
	}

}

//SBI is another class which is also called as child class extends from parent class Bank
//SBI child class should also use the same method as parent class Bank which is ROI- method but only the implementation changes in
//the print statement
class SBI extends Bank {

	public void ROI() {
		System.out.println("ROI from SBI");
	}
}

// ICICI is another class which is also called as child class extends from parent
// class Bank
// ICICI child class should also use the same method as parent class Bank which is
// ROI- method but only the implementation changes in
// the print statement

class ICICI extends Bank {

	public void ROI() {
		System.out.println("ROI from ICICI");
	}
}

public class Overridding {

	
//Method overriding - All the child class uses the same method name as parent method 
//Method overriding is also called as Run time Polymorphism
//Method overriding can be achived only when we have atleast 1 parent and 1 child
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Creating an object for parent class 		
		Bank bank = new Bank();
		bank.ROI();
// Creating an object for child class
		SBI sbi = new SBI();
		sbi.ROI();

// Creating an object for another child class
		ICICI icici = new ICICI();
		icici.ROI();

		
		
		
	}

}
