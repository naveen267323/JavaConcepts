package JavaBascis;

interface Interface_I1 {

	void interfacemessage1(); // Abstract method - means no implementation - so the access modifier is public becasue
							//	no access modifier is present.
							// interface will allow only 3 methods - deafult, static and abstract method
}

interface Interface_I2 {

	void interfacemessage2(); // Abstract method - means no implementation
								

}

/*class messages implements Interface_I1, Interface_I2 {


	@Override
	public void interfacemessage2() { // The same interface method interfacemessage 2 we are 
		System.out.println("Interface I2 ");
		
	}

	@Override
	public void interfacemessage1() {
		System.out.println("Interface I1 ");
		
	}
}
*/
public class Interface implements Interface_I1, Interface_I2 {


	@Override
	public void interfacemessage2() { // The same interface method interfacemessage 2 we are 
		System.out.println("Interface I2 ");
		
	}

	@Override
	public void interfacemessage1() {
		System.out.println("Interface I1 ");
		
	}  
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface msg = new Interface();
		msg.interfacemessage1();
		msg.interfacemessage2();
		

	}

}

//Interface uses the keyword as Interface
