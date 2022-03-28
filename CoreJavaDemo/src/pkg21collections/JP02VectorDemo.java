package pkg21collections;

import java.util.Vector;

public class JP02VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vecStrings = new Vector<>();
		
		System.out.println("Initial Size of arrListStrings: " + vecStrings.size());
		
		vecStrings.add("Java");
		vecStrings.add("C");

		System.out.println("Size of arrListStrings: " + vecStrings.size());
		vecStrings.add(2, "Python");
		vecStrings.add(1, "Go");
		
		for(int i = 0; i < vecStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + vecStrings.get(i));
		}
		vecStrings.set(1, "JavaScript");
		
		for(int i = 0; i < vecStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + vecStrings.get(i));
		}
		vecStrings.remove(1);
		for(int i = 0; i < vecStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + vecStrings.get(i));
		}
		vecStrings.removeAll(vecStrings);
		for(int i = 0; i < vecStrings.size(); i++) {
			
			System.out.println("Element at index " + i + ": " + vecStrings.get(i));
		}
		
		System.out.println("Size of arrListStrings: " + vecStrings.size());
	}
}
