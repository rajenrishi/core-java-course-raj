/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 04
//Write a Java program to read a measurement from user in feet and convert to inches. 
//Print the output. 

public class Assign04FeetToInchesConv {

	public static void main(String[] args) {
		int ht_inches = 0;
		
		Scanner rdIn = new Scanner(System.in);
		System.out.print("Enter height (feet): ");		
		int height = rdIn.nextInt();
		
		ht_inches = height * 12;
		System.out.println(height + " feet is equal to " + ht_inches + " inches.");
		
		rdIn.close();
	}
}
