package JavaBascis;

public class WrapperStringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// refer to session 17 java by pavan	
		
		// Addtion of String -
		String S1 = "10";
		String S2 = "30";
		// inorder to add 10 and 30 - we see the datatype as string - So we have to
		// convert string to integer and then do the addtion.
		//Reason for converting string to interger is because we cannot perform arthmetic operation on string data type
		// Convert String to Integer using Integer wrapper class and parseInt
		int I1 = Integer.parseInt(S1);
		int I2 = Integer.parseInt(S2);

		int I3 = I1 + I2;

		System.out.println(I3);

	}

}
