/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 14
//Write a program to create an array of size 10. Fill the array with multiples of 5.


public class Assign14ArrayFill5Multiples {

	public static void main(String[] args) {
		
		int [] arrFiveMul = new int[10];
		
		for(int i = 0; i < arrFiveMul.length; i++) {
			
			arrFiveMul[i] = (i+1) * 5;
		}
		
		for(int ele : arrFiveMul) {
			
			System.out.print(" " + ele);
		}
	}
}
