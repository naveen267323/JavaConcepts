package JavaBascis;

public class arraysingledimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(a.length); // to print the size of array;

		System.out.println(a[0]); // to print 0th index of array;

		// for each loop to iterate thru each index and print the values;

		for (int arr : a) {
			System.out.println(arr);

		}

	}

}
