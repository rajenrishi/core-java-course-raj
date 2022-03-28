/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.HashMap;

//Assignment: 38
//Write a Java program to count the number of key-value (size) mappings in a map.

public class Assign38HashMapSize {
	
	public static void main(String[] args) {

		HashMap<Integer, String> hmInStr = new HashMap<>();
		
		// add elements into HashMap
		hmInStr.put(1,  "One");
		hmInStr.put(2,  "Two");
		hmInStr.put(3,  "Three");
		
		System.out.println("Number of elements in Hashmap: " + hmInStr.size());
	}
}
