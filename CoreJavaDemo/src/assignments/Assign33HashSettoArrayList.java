/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.ArrayList;
import java.util.HashSet;

//Assignment: 33
//Write a Java program to convert a hash set to a List/ArrayList.

public class Assign33HashSettoArrayList {
	
	public static void main(String[] args) {

		HashSet<String> hsStr = new HashSet<>();
		ArrayList<String> alStr = new ArrayList<>();
		
		// add elements into HashSet
		hsStr.add("Java");
		hsStr.add("C");
		hsStr.add("JavaScript");
		hsStr.add("Go");
		hsStr.add("C++");
		hsStr.add("CSharp");

		alStr.addAll(hsStr);
		System.out.println("Array List: " + alStr);
	}
}
