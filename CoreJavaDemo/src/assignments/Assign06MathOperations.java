/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 06
//Write a Java program to read one character (string) and two numbers from  the user.
//Valid values for character” ‘a', ‘s’, ‘m’ and ‘d’
//If user input is ‘a’; print the sum of two numbers
//If user input is ‘s’, print the difference of two numbers
//If user input is ‘m’, print the product of two numbers
//If user input is ‘d’, print the result after division of two numbers
//If user inputs any other character then print “Incorrect operation”.
//Hint: Use Scanner class, arithmetic operators, switch statement.

public class Assign06MathOperations {

	public static void main(String[] args) {
		int res = 0;
		
		// ClassName refName = new ClassName
		Scanner rdIn = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = rdIn.nextInt();
		
		System.out.print("Enter num2: ");		
		int num2 = rdIn.nextInt();
		
		System.out.print("Enter operation: ");
		String ch = rdIn.next();
		
		switch(ch) {

			case "a": res = num1 + num2;
					break;
	
			case "s": res = num1 - num2;
					break;
					
			case "m": res = num1 * num2;
			        break;
			
			case "d": res = num1 / num2;
					break;
					
			default: System.out.println("Incorrect operation.");
		}
		
		System.out.println("Result of given maths operation is: " + res);
		
		rdIn.close();
	}
}
