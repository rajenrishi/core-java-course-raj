/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.HashSet;

//Assignment: 31
//Write a Java program to get the number of elements in a hash set.

public class Assign31HashSetEleCount {
	
	public static void main(String[] args) {

		HashSet<String> hsStr = new HashSet<>();
		
		// add elements into HashSet
		hsStr.add("Java");
		hsStr.add("C");
		hsStr.add("JavaScript");
		hsStr.add("Go");
		hsStr.add("C++");
		hsStr.add("CSharp");
		

		System.out.println("Number of elements in HashSet: " + hsStr.size());
	}
}
