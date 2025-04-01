package JavaBascis;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Only String data values are being passed in the hashset collection.
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("Apple");
		hashset.add("Mango");
		hashset.add("Banana");

		System.out.println(hashset);

		hashset.remove("Apple");

		if (!hashset.contains("Apple")) {
			hashset.add("Cherry");
		}

		System.out.println(hashset);

	
		// Passing hetrogenius data into Hashset collection.

		HashSet hashset1 = new HashSet();
		
	//	LinkedHashSet hashset1 = new LinkedHashSet();
		
		hashset1.add("Naveen");
		hashset1.add(100);
		hashset1.add("mar/10/1988");
		hashset1.add("Dutt");
		hashset1.add(100);

		System.out.println(hashset1.size());

		// input in the hashset1 contains duplicate value : 100 but in the output you
		// will see only 1 100 -
		// which means duplicate is not allowed in Hashset.
		System.out.println(hashset1);

		// To remove the value from hashset you need to mention the value that should be
		// removed from the hashset
		// because we cannot give the index number to remove the value from the hashset.
		// Here we are removing naveen from the hashset1

		hashset1.remove("Naveen");
		System.out.println(hashset1);
		
	
		
		
		// read all the values in the hashset collection using loop

		for (Object x : hashset1) {
			System.out.println(x);
		}

	}

}
