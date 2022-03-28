package pkg21collections;

import java.util.TreeSet;

public class JP08TreeSetOperationsDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> tsNums1 = new TreeSet<>();

		tsNums1.add(2);  // autoboxing
		tsNums1.add(6);
		tsNums1.add(4);
		tsNums1.add(5);
		tsNums1.add(3);
		tsNums1.add(7);
		
		System.out.println(tsNums1);
		
		TreeSet<Integer> tsNums2 = new TreeSet<>();

		tsNums2.add(2);  // autoboxing
		tsNums2.add(3);
		tsNums2.add(7);
		tsNums2.add(4);
		
		System.out.println(tsNums2);
		
		//Union - addAll() method
//		tsNums1.addAll(tsNums2);
//		System.out.println("Union: " + tsNums1);
		
		//Intersection - retainAll() method
//		tsNums1.retainAll(tsNums2);
//		System.out.println("Intersection: " + tsNums1);
		
		//Difference - removeAll() method
//		tsNums1.removeAll(tsNums2);
//		System.out.println("Difference: " + tsNums1);
		
//		tsNums2.removeAll(tsNums1);
//		System.out.println("Difference: " + tsNums2);
		

		//Difference - removeAll() method
		boolean ret = tsNums1.containsAll(tsNums2);
		System.out.println("SubSet: " + ret);
		
		
	}
}
