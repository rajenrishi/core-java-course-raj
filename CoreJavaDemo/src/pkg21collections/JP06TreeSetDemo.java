package pkg21collections;

import java.util.Iterator;
import java.util.TreeSet;

public class JP06TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> tsStrings = new TreeSet<>();
		
		// Add elements
		tsStrings.add("Java");
		tsStrings.add("Python");
		System.out.println(tsStrings);
		
		
		//e1 => e2 => e3
		
		//Accessing elements iterator
		Iterator<String> iter = tsStrings.iterator();
//		System.out.println(iter.hasNext());
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

		// Remove elements
		tsStrings.remove("Java");
		System.out.println(tsStrings);
	}
}
