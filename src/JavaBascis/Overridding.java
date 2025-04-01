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
//Method overriding is also called as RUN time Polymorphism
//this is also called as DYNAMIC polymorphism
//Method overriding can be achived only when we have atleast 1 parent and 1 child - INHERITANCE

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Creating an object for parent class 		
		Bank bank = new Bank();
		bank.ROI();
// Creating an object for child class
		Bank bank1 = new SBI();
		bank1.ROI();

// Creating an object for another child class
		Bank bank2 = new ICICI();
		bank2.ROI();

	}

}
