/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 13
//Using nested loop (while or for) print the below pattern:
//*
//*  *
//*  *  *
//*  *  *  *
//*  *  *  *  *

public class Assign13PatternDisplay {

	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("* ");
			}			
			System.out.println("");
		}	
	}
}
