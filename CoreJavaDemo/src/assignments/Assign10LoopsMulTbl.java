/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 11
//Read the number from user and find factorial and print.

public class Assign10LoopsMulTbl {

	public static void main(String[] args) {
		
		int fact = 1;

		Scanner scanIn = new Scanner(System.in);
		
		System.out.print("Enter number: ");		
		int num = scanIn.nextInt();
		
		for(int cnt=num; cnt > 0; cnt--) {
			
			fact = fact * cnt;
		}
		System.out.println("Factorial of given number is: " + fact);
		
		scanIn.close();
	}
}
