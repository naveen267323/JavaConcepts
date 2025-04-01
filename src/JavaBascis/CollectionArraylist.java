package JavaBascis;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList mylist = new ArrayList(); // Arraylist can store any datatype values such as :
											// String,interger,boolean,double -- called as Hetogenius data
		
	//	LinkedList mylist = new LinkedList();
		
		
		
		mylist.add("Naveen");
		mylist.add("Dutt");
		mylist.add(36);
		mylist.add("mar/10/1988");
		mylist.add(500.00);
		mylist.add(true);

		// To know the size of the arraylist : mylist
		System.out.println(mylist.size());

		// To know the value / To read / To Print what is stored in the arraylist
		System.out.println(mylist);

		// To Remove value from arraylist or mylist
		mylist.remove(2);
		System.out.println(mylist);

		// To modify/change the existing value in the arraylist - you need to know the
		// index value and then modify or change.
		mylist.set(2, 77);
		System.out.println("we are inserting 77 in the array index value 2 ");

		System.out.println(mylist);

		// To insert new value to the existing value in the arraylist - you need to know
		// the index value and then modify or change
		mylist.add(1, "JAVA");
		System.out.println("We are inserting dutt with java");

		System.out.println(mylist);

		// To access specific value in an arraylist - you need to give the index value
		// using get method- in this example im retriving 77

		System.out.println(mylist.get(3));

		// check if dutt is avaialable in the arraylist - if present change the dutt to
		// naveen

		String validate = (String) mylist.get(2);

		if (validate == "Dutt")
			;
		mylist.set(2, "Naveen");
		System.out.println(mylist);

		// check if 500.0 is avaialable in the arraylist - if present change the 500.0
		// to 500000.0

		double check = (double) mylist.get(4);

		if (check == 500.0);
		mylist.set(4, 500000.0);
		System.out.println(mylist);

		// Reading all the values in the arraylist

		for (Object list : mylist) {
			System.out.println(list);
		}

	}

}
