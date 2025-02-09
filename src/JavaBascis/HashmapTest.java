package JavaBascis;

import java.util.HashMap;

public class HashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(1, "Apple");
		hashmap.put(2, "Apple");
		hashmap.put(3, "Cherry");

	
		System.out.println(hashmap);
		
		System.out.println("Value for key 2 " + hashmap.get(2));

		hashmap.remove(2);

		hashmap.put(4, "Mango");	
		System.out.println(hashmap);
		
		
		System.out.println("To print all the keys and values in the hashmap collection " + hashmap.entrySet());
		
		
		
		//Use entrySet() for iterating through the key-value pairs in the HashMap
		
		for(Object x:hashmap.entrySet())
		{
			System.out.println(x);
		}
		
	}

}
