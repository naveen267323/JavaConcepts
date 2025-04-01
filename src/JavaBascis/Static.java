package JavaBascis;

public class Static {

	static int num = 10;

	static void count() {

		System.out.println("static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		System.out.println(Static.num); // calling the static variable by using class name - thisway calling static
		Static.count(); // calling the static Method by using class name

// above way of calling the static method and static variable with the class name is useful when you are calling the static 
//method and static variable in a different main Method.class .i.e. when the static variable / static method and the main method is 
//present in the different class and you want to access the static variable and static method in the main method present in the
//differnt class

		System.out.println(num); // calling the static variable without using the class name becaue main method
									// is also static
		count(); // calling the static variable without using the class name because main method
					// is also static

	}

}
