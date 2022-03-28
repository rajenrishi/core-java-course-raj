/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.HashMap;

//Assignment: 39
//Write a Java program to check whether a map contains key-value mappings (empty) or not.

public class Assign39HashMapEmpty {
	
	public static void main(String[] args) {

		HashMap<Integer, String> hmInStr = new HashMap<>();
		
		// add elements into HashMap
		hmInStr.put(1,  "One");
		hmInStr.put(2,  "Two");
		hmInStr.put(3,  "Three");
		
		if(hmInStr.isEmpty()) {
			
			System.out.println("HashMap is empty.");
		
		} else {
		
			System.out.println("HashMap is not empty.");
		}
	}
}
