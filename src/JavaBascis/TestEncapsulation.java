package JavaBascis;

import java.util.Arrays;

class Account {

	private String name;
	private int acc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

}

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.setName("Naveen");
		System.out.println(acc.getName());

		String S = "hello world";
		System.out.println(S.length());
		
		String A[] = {"sun","mon","tue"};
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(Arrays.toString(A));
		
		
		

//		acc.setName("naveen");
//	
	}

}
