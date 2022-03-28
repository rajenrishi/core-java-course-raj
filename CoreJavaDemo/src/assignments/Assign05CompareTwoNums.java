/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 05
//Write a Java program to read two integers from the user and print as below based on their values.
//Print ‘x greater than y’
//OR print ‘x less than y’
//OR print ‘x equal to y’ based on the passed values.
//Hint: User if-else if-else statement and comparison operators.


public class Assign05CompareTwoNums {

	public static void main(String[] args) {
		
		Scanner rdIn = new Scanner(System.in);
		System.out.print("Enter x: ");		
		int xVal = rdIn.nextInt();
		
		System.out.print("Enter y: ");		
		int yVal = rdIn.nextInt();
		
		if(xVal > yVal) {
			
			System.out.println("x is greater than y");
			
		} else if(xVal < yVal) {
			
			System.out.println("x is less than y");
			
		} else {
			
			System.out.println("x is equal to y");
		}
		
		rdIn.close();
	}
}
