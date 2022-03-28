/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.Iterator;
import java.util.LinkedList;

//Assignment: 30
//Write a Java program to insert elements into the linked list at the first and last position.

public class Assign30LinkedListLstFirst {
	
	public static void main(String[] args) {

		LinkedList<String> llStr = new LinkedList<>();
		
		// add elements into linked list
		llStr.add("Java");
		llStr.add("C");
		llStr.add("JavaScript");
		llStr.add("Go");
		llStr.add("C++");
		llStr.add("CSharp");
		

		// add element at first position
		llStr.addFirst("firstELe");
		
		// add element at last position
		llStr.addLast("lastELe");
		
		Iterator<String> revIt = llStr.iterator();
		while(revIt.hasNext()) {
			
			System.out.println(revIt.next());
		}
	}
}
