/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 03
//Write a Java program to find area of a rectangle. 
//Read the length and breadth from the user. 
//Print the output.
//Hint: Use Scanner class, arithmetic operators

public class Assign03AreaOfRect {

	public static void main(String[] args) {
		int area = 0;
		
		Scanner rdIn = new Scanner(System.in);
		System.out.print("Enter length: ");		
		int length = rdIn.nextInt();
		System.out.print("Enter breadth: ");		
		int breadth = rdIn.nextInt();
		
		area = length * breadth;
		System.out.println("Area of rectangle is: " + area);
		
		rdIn.close();
	}
}
