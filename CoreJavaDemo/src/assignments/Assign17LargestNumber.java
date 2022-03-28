/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 17
//Write a program to find largest number in an array.

public class Assign17LargestNumber {

	public static void main(String[] args) {
		
		int [] arrEle = {34, 22, 29, 13, 33, 76, 54, 39, 61};
		int larNum = -1;
		
		for(int i = 0; i < arrEle.length; i++) {
			
			if(arrEle[i] > larNum) {
				
				larNum = arrEle[i];
			}
		}
		System.out.print("Largest number in the array is: " + larNum);
	}
}
