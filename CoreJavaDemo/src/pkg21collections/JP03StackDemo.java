package pkg21collections;

import java.util.Stack;

public class JP03StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stackStrings = new Stack<>();
		stackStrings.push("Python");
		stackStrings.push("Java");
		stackStrings.push("C");
		
		System.out.println(stackStrings);

		stackStrings.pop();
		System.out.println(stackStrings);
		stackStrings.peek();
		System.out.println(stackStrings.peek());
	}
}
