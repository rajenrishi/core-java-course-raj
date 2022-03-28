/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.SortedMap;
import java.util.TreeMap;

//Assignment: 40
//Write a Java program to get a portion of a map whose keys are greater than to a given key.

public class Assign40HashMapGTKey {
	
	public static void main(String[] args) {

		TreeMap<Integer, String> tmInStr = new TreeMap<>();
		
		// add elements into HashMap
		tmInStr.put(1,  "One");
		tmInStr.put(2,  "Two");
		tmInStr.put(3,  "Three");
		
		SortedMap<Integer, String> sm = tmInStr.tailMap(2);
		System.out.println("Map elements greated than given key: " + sm);
	}
}
