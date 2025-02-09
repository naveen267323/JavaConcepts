package JavaBascis;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Print the number 1 to 10
//Print the number in ascending order from 1 to 10

		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(i);
		}
		System.out.println("-----------------------");

//===========
//		Printing odd number from 1 to 10

		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
//================
//Printing even number from 1 to 10

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i);
		}

//==============================
//Print the number in descending order

		for (int i = 10; i >= 0; i = i - 1) {
			System.out.println(i);
		}

	}

}
