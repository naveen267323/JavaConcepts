package JavaBascis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in); // Scanner class is used to accept the input from the user
		System.out.println("Enter your name");

		try {
			scann.nextLine();// nextLine() method is used to read the string data given by the use and it
								// will not stop once it find the space

		}

		catch (InputMismatchException e) {
		}

//===========================================================================

		System.out.println("Let us start with the Addtion");

		System.out.println("Enter the number");

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt(); // to read the integer
		System.out.println("Enter the another number");

		int b = scan.nextInt(); // to read another integer/number

		int c = a + b;// adding 2 interger
		System.out.println("Answer " + (c));

//====================================================================================

		System.out.println("Division");

		System.out.println("Enter the number");

		// scan.nextLine();// nextLine() method is used to read the string data given by
		// the use and it will not stop once it find the space

		float a1 = scan.nextInt(); // to read the integer
		System.out.println("Enter the another number");

		float b1 = scan.nextInt();

		// Arithmetic operator / should be used to in division and data type float
		// should be used to get the exact division at output
		// if the data type integer is used then the division will truncate the decimal
		// value

		try {
			float c1 = a1 / b1;
			System.out.println("Result " + c1);
		} catch (ArithmeticException e) {
			System.out.println("unexpected error occured : Divide " + e.getMessage() + " is not possible");
		} finally {
			System.out.println("Execution is completed");
		}

//================================================================		
		System.out.println("Multiplication");

		System.out.println("Enter the number should be greater than 0");

		int a2 = scan.nextInt();

		System.out.println("Enter another number  greater than 0");
		int b2 = scan.nextInt();

		// Using the 'if else' statement to validate the input being received from user
		if (a2 > 0 && b2 > 0) {
			System.out.println("Thank your entering the numbers greater than 0");
			int c2 = a2 * b2;
			System.out.println("Result " + c2);
		} else {
			System.out.println("invalid input");
		}

//==============================================		
//Write a code to accept 3 number from user and find the largest number
//logic  a>b and a>c
//		 b>a and b>c
//		 c>a and c>b 

		System.out.println("Give the input for 3 number to find the largest number");

		System.out.println("Enter first number");
		int q = scan.nextInt();

		System.out.println("Enter second number");
		int w = scan.nextInt();

		System.out.println("Enter third number");
		int r = scan.nextInt();

		// Using the 'if elseif' statement to validate the input being received from
		// user
		if (q > w && q > r) {
			System.out.println("greater number is  " +q);
		} else if (w > q && w > r) {
			System.out.println("greater number is  " +w);
		}

		else if ((r > q && r > w)) {
			System.out.println("greater number is  " +r);
		}

		
//=======================
		System.out.println("Enter First letter of the days of the week");
		String input = scan.next();
		// Using || to handle multiple inputs
        if (input.equals("S") || input.equals("SU")) {
            System.out.println("It's either Sunday or Saturday.");
        } else if (input.equals("M")) {
            System.out.println("It's Monday.");
        } else if (input.equals("T") || input.equals("TU")) {
            System.out.println("It's Tuesday.");
        } else if (input.equals("W")) {
            System.out.println("It's Wednesday.");
        } else if (input.equals("TH")) {
            System.out.println("It's Thursday.");
        } else if (input.equals("F")) {
            System.out.println("It's Friday.");
        } else if (input.equals("SA")) {
            System.out.println("It's Saturday.");
        } else {
            System.out.println("Invalid input. Please enter a valid day initial.");
        }

	}
}
