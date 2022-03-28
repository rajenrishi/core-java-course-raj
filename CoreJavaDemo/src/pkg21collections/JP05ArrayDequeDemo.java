package pkg21collections;

import java.util.ArrayDeque;

public class JP05ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<String> adStrings = new ArrayDeque<>();
		
		// Add elements
		adStrings.add("Java");
		adStrings.add("Python");
		adStrings.addFirst("C");
		adStrings.addLast("JavaScript");
		adStrings.offer("Go");
		System.out.println(adStrings);
		
		//offer, offerFirst, offerLast
		
		// Access elements
//		System.out.println(adStrings.getFirst());
//		System.out.println(adStrings.getLast());
//		System.out.println(adStrings.peek());
//		System.out.println(adStrings.peekLast());

		// Remove elements
		System.out.println(adStrings.remove());
		System.out.println(adStrings.removeLast());
		System.out.println(adStrings.removeFirst());
		System.out.println(adStrings);
		System.out.println(adStrings.remove("JavaScript"));
		System.out.println(adStrings);
		

		System.out.println(adStrings.poll());
		// queue is empty
		System.out.println(adStrings.poll());
		System.out.println(adStrings.remove());
		
		//clear()
	}
}
