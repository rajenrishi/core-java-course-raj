package pkg21collections;

import java.util.ArrayList;

public class JP01ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrListStrings = new ArrayList<>();
		
		System.out.println("Initial Size of arrListStrings: " + arrListStrings.size());
		
		arrListStrings.add("Java");
		arrListStrings.add("C");

		System.out.println("Size of arrListStrings: " + arrListStrings.size());
		arrListStrings.add(2, "Python");
		arrListStrings.add(1, "Go");
		
		for(int i = 0; i < arrListStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + arrListStrings.get(i));
		}
		arrListStrings.set(1, "JavaScript");
		
		for(int i = 0; i < arrListStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + arrListStrings.get(i));
		}
		arrListStrings.remove(1);
		for(int i = 0; i < arrListStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + arrListStrings.get(i));
		}
		arrListStrings.removeAll(arrListStrings);
		for(int i = 0; i < arrListStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + arrListStrings.get(i));
		}
		
		System.out.println("Size of arrListStrings: " + arrListStrings.size());
	}
}
