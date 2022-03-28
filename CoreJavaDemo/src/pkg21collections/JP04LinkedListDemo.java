package pkg21collections;

import java.util.LinkedList;

public class JP04LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llStrings = new LinkedList<>();
		llStrings.add("Python");
		llStrings.add("Java");
		llStrings.add("C");
		
		System.out.println(llStrings);

		llStrings.indexOf("C");
		System.out.println(llStrings.indexOf("C"));
		llStrings.peek();
		System.out.println(llStrings.peek());
	}
}
