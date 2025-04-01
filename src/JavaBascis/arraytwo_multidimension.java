package JavaBascis;

public class arraytwo_multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring 2 dimenisonal array/multi dimensional array
		int a[][] = new int[3][2];

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		System.out.println("Total number of rows  " + a.length); // to find the number of rows only;
		System.out.println("Total number of columns " + a[0].length); // to find the number of column only;

		System.out.println("to find the values columns " + a[0][1]);
		System.out.println("to find the values columns " + a[0][0]);

// we need to use 2 for each loop to iterate thru each value
//arr[] and x - is a variable	
//remember this syntax of iterate thru each value 

		for (int arr[] : a) {
			for (int x : arr) {
				System.out.println(x);
			}
		}

	}

}
