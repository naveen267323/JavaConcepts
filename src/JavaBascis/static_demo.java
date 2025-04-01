package JavaBascis;

public class static_demo {

	static int a = 10;

	static void m1() {
		System.out.println("this static method");
	}

/////////////////////////////////////////////////////////////////////////////
	int b = 20;

	void m2() {
		System.out.println("this is a non static method we have created the object of the class in the main method"
				+ "in order to access the non static method");
	}

////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//object of the class is not created inorder to access the method or variable	becasue even main method is static
//and we are calling only static methods and static variable in the method so no need to create the object of the class
//inorder to call the method and variable
		System.out.println(a);
		m1();

		static_demo sd = new static_demo();
		System.out.println(sd.b);
		sd.m2();

	}

}
