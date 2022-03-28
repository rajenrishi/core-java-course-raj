/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.Iterator;
import java.util.TreeSet;

//Assignment: 36
//Write a Java program to retrieve and remove the last element of a tree set.

public class Assign36TreeSetRetrieveRemove {
	
	public static void main(String[] args) {

		TreeSet<Integer> tsStr = new TreeSet<>();
		
		// add elements into HashSet
		tsStr.add(12);
		tsStr.add(11);
		tsStr.add(20);
		tsStr.add(3);
		tsStr.add(4);
		tsStr.add(6);

		Integer iR = tsStr.pollLast();
		System.out.println("Removed element is: " + iR);
		
		// Tree set after removing element
		Iterator<Integer> tsIt = tsStr.iterator();
		while(tsIt.hasNext()) {
			
			System.out.println(tsIt.next());
		}
	}
}
