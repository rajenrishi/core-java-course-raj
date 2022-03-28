/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.Iterator;
import java.util.TreeSet;

//Assignment: 34
//Write a Java program to iterate through all elements in a tree set.

public class Assign34TreeSetIterate {
	
	public static void main(String[] args) {

		TreeSet<String> tsStr = new TreeSet<>();
		
		// add elements into HashSet
		tsStr.add("Java");
		tsStr.add("C");
		tsStr.add("JavaScript");
		tsStr.add("Go");
		tsStr.add("C++");
		tsStr.add("CSharp");

		Iterator<String> tsIt = tsStr.iterator();
		while(tsIt.hasNext()) {
			
			System.out.println(tsIt.next());
		}
	}
}
