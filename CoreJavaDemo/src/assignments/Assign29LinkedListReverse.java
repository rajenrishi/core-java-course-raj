/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.Iterator;
import java.util.LinkedList;

//Assignment: 29
//Write a Java program to iterate a linked list in reverse order.

public class Assign29LinkedListReverse {
	
	public static void main(String[] args) {

		LinkedList<String> llStr = new LinkedList<>();
		
		// add elements into linked list
		llStr.add("Java");
		llStr.add("C");
		llStr.add("JavaScript");
		llStr.add("Go");
		llStr.add("C++");
		llStr.add("CSharp");
		
		Iterator<String> revIt = llStr.descendingIterator();
		while(revIt.hasNext()) {
			
			System.out.println(revIt.next());
		}
	}
}
