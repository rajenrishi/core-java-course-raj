/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.Iterator;
import java.util.Stack;

//Assignment: 33
//Write a Java program to convert a hash set to a List/ArrayList.

public class Assign32StackIterate {
	
	public static void main(String[] args) {

		Stack<String> stStr = new Stack<>();
		
		// add elements into Stack
		stStr.add("Java");
		stStr.add("C");
		stStr.add("JavaScript");
		stStr.add("Go");
		stStr.add("C++");
		stStr.add("CSharp");

		Iterator<String> sIt = stStr.iterator();
		while(sIt.hasNext()) {
			
			System.out.println(sIt.next());
		}
	}
}
