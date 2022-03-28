/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */



package assignments;

import java.util.SortedSet;
import java.util.TreeSet;

//Assignment: 35
//Write a Java program to find the numbers less than 7 in a tree set.

public class Assign35TreeSetLessThanGiven {
	
	public static void main(String[] args) {

		TreeSet<Integer> tsStr = new TreeSet<>();
		
		// add elements into HashSet
		tsStr.add(12);
		tsStr.add(11);
		tsStr.add(20);
		tsStr.add(3);
		tsStr.add(4);
		tsStr.add(6);

		SortedSet<Integer> ss = tsStr.headSet(7);
		System.out.println(ss);
	}
}
