package JavaBascis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println("please enter String");

		// Scanner in = new Scanner(System.in);

		String in = null;

		try {
			System.out.println(in.length());
		} catch (Exception e) {
			System.out.println("exception is handled becasue - you are checking the length of a null and exception msg is");
			System.out.println(e.getMessage());
		}

	}

}
