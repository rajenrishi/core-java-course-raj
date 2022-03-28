/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 11
//Read the number from user and find factorial and print.

public class Assign11Factorial {

	public static void main(String[] args) {

		Scanner scanIn = new Scanner(System.in);
		
		System.out.print("Enter number: ");		
		int num = scanIn.nextInt();
		
		for(int cnt=1; cnt <=10; cnt++) {
			
			System.out.println(num + " x " + cnt + " = " + (num * cnt));
		}
		
		scanIn.close();
	}
}
