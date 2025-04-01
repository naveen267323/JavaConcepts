package JavaBascis;

public class array_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//storing hetrogenius data	
		Object a[] = { 100, 10.0, "naveen", true };
		
		System.out.println(a.length);
		System.out.println(a[1]);
		
		for (Object arr:a) {
			System.out.println(arr);
		}
		

	}

}
