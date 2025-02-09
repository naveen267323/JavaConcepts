package JavaBascis;

import java.util.Scanner;

public class EvenorOddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");

		int a1 = scan.nextInt();

		// Arithmetic operator % should be used to get the remainder of the division
		// if the interger reminder = 0 then it is even number
		if (a1 % 2 == 0) {
			System.out.println("Entered number is even number");
		}

		else {

			System.out.println("Entered number is odd number");
		}
	}

}
