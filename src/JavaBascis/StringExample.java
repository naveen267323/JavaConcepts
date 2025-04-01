package JavaBascis;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Approch 1: To check the number of character in a string
// or To check the length of a string

		String st = "Naveen dutt";
		int s = st.length(); // Return type of the length is a integer, we are passing into integer variable
		System.out.println(s); // printing the integer type variable to get the number of character in a string

//================

//Approch 2: To check the number of character in a string
// or To check the length of a string

		String st1 = "Naveen dutt";
		System.out.println(st1.length()); // printing the integer directly in the output

//================		
//Declaration of string in a different way
//String concatination

		String st3 = new String("In the input string, even the space is counted .i.e considered ");
		String st4 = new String(" as a Character. So output of the input string count is 11 in Naveen dutt");
		String st5 = st3 + st4;// concatincation of strings using '+' operator
		String st6 = st3.concat(st1); // concatination of strings using concat()method
		System.out.println(st6 + st5);

//=====================
//Removing the space in the string using method call trim()
		// trim() method only remove the spaces at starting of the string and ending of
		// the string but it will not remove the spaces in between the words

		String st7 = new String("  Naveen dutt  ");
		System.out.println("lenght of the string before removing the spaces  " + st7.length());
		String st8 = st7.trim();

		System.out.println("lenght of the string after removing the spaces  " + st8.length());

		System.out.println(
				"trim() method only remove the spaces of the string only at starting of the string and ending of \n"
						+ " the string but it will not remove the spaces in between the words");

//======================
//charAt() method is used to pull/extract only 1 particular character from the string using index value
//
		String st9 = "Naveen dutt";
		System.out.println("The index value 4 has a character  " + st.charAt(4) + "  in the given string Naveen dutt");

//substring(i,i) - Methos is used to pull more than 1 character from the string using index value

		String st10 = st9.substring(4, 6);//
		System.out.println(st10);
		System.out.println(
				"substring index range 4 - starting index value and 6(6-1=5) index value to print 'en' from the string");

//equals and equalsignorecase
//comparing 2 string using equals method and equalsignorecase method
//equals method should be used when 2 both string should be having upper case or lower case - retruns TRUE
//when you are comparing upper and lower case string we should use equalsignore case method to retrun TRUE in the output

		String st11 = "NAVEEN";
		String st12 = "NAVEEN";

		// Comparing 2 strings having string values in UPPER case
		System.out.println(st11.equals(st12));
		System.out.println(st11 == st12); // another way of comparing a strings

		String st13 = "NAVEEN";
		String st14 = "NAVeeN";

		System.out.println(st13.equals(st14)); // return false becasue i have use equals method

		// Comparing 2 strings having string values in UPPER case and Lower case - using
		// equalignore case to return TRUE
		System.out.println(st13.equalsIgnoreCase(st14)); // return true becasue i have equalsignore method to ignore the
															// case sensitivity in the string input

//====================================
//Split strings using the delimeter
//Spliting the string with @ delimeter will return the string in an array 
//So we are storing the split strings into single dimension array
//====================================

		String st15 = "naveendutt1988@gmail.com";

		String st17[] = st15.split("@");// Spliting the string with @ delimeter will return the string in an array

		System.out.println(st17[0]); // will print naveendutt
		System.out.println(st17[1]); // will print gmail.com

		System.out.println(Arrays.toString(st17));// will join the array and print the value of the array

		System.out.println(st15.length() + " naveendutt1988@gmail.com");
		
//==========================
//print the strings separtly : naveendutt1988@gmail.com 

		String st18 = "naveendutt1988@gmail.com";

		// String st19[] = st18.split("@");
		// System.out.println(st19[0] +" " + st19[1]);

		System.out.println(st18.substring(0, 10));

		System.out.println(st18.substring(10, 14));
		
		// String st20 = st19[0];

		// System.out.println(st20.substring(10,14));

		System.out.println(st18.replaceAll("naveendutt1988@",""));

	}

}
