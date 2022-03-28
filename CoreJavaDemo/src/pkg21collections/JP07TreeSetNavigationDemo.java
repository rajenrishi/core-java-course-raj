package pkg21collections;

import java.util.TreeSet;

public class JP07TreeSetNavigationDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> tsNums = new TreeSet<>();

		tsNums.add(2);  // autoboxing
		tsNums.add(6);
		tsNums.add(4);
		tsNums.add(5);
		
		System.out.println(tsNums);
		
//		System.out.println("First: " + tsNums.first());
//		System.out.println("Last: " + tsNums.last());

//		System.out.println("Higher: " + tsNums.higher(4));   // after element lowest
//		System.out.println("Lower: " + tsNums.lower(6));     // before element highest
		
//		System.out.println("Ceiling: " + tsNums.ceiling(3));
//		System.out.println("Floor: " + tsNums.floor(7));
		

		System.out.println("Head set: " + tsNums.headSet(5, true));
		//tailSet - after given element
		// subSet - between elements, true - include given elements
		
	}
}
