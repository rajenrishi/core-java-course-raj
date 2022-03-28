/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 12
//Write a Java program to read numbers from the user. 
//The program has to allow the numbers until user enters -1. 
//Once user enters -1 program should stop reading numbers and 
//calculate the sum of all the numbers entered and print the same.
//Hint: User while loop, arithmetic operators, break statement

public class Assign12NumbersSum {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;

		Scanner scanIn = new Scanner(System.in);
		
		do {
			sum = sum + num;

			System.out.print("Enter number: ");		
			num = scanIn.nextInt();
			
		} while(num != -1);
		
		System.out.print("Sum of given numbers is: " + sum);
		
		scanIn.close();
	}
}
