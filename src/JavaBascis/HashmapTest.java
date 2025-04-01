package JavaBascis;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		HashMap hashmap = new HashMap();
		
	//	LinkedHashMap hashmap = new LinkedHashMap();
		

		// Keys and values the data is stored
		// only keys cannot be added
		// only values cannot be added
		// keys should be unique but values can be duplicates

		hashmap.put(1, "Apple");
		hashmap.put(2, "Apple");
		hashmap.put(3, "Cherry");

		System.out.println(hashmap);

		System.out.println("Value for key 2 " + hashmap.get(2));

		hashmap.remove(2);

		hashmap.put(2, "Mango");
		System.out.println(hashmap);

		System.out.println("To print all the keys and values in the hashmap collection " + hashmap.entrySet());

		// HashMap used entrySet()method for iterating through the key-value pairs in
		// the HashMap

		for (Object x : hashmap.entrySet()) {
			System.out.println(x);
		}

	}

}
