/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.Iterator;
import java.util.TreeSet;

//Assignment: 37
//Write a Java program to remove a given element from a tree set.

public class Assign37TreeSetRemoveGiven {
	
	public static void main(String[] args) {

		TreeSet<Integer> tsStr = new TreeSet<>();
		
		// add elements into HashSet
		tsStr.add(12);
		tsStr.add(11);
		tsStr.add(20);
		tsStr.add(3);
		tsStr.add(4);
		tsStr.add(6);

		tsStr.remove(11);
		
		// Tree set after removing element
		Iterator<Integer> tsIt = tsStr.iterator();
		while(tsIt.hasNext()) {
			
			System.out.println(tsIt.next());
		}
	}
}
