

import java.util.Scanner;

//Assignment: 18
//Write a program to split an array into two arrays. 
//Input array will have only positive numbers greater than 0.
//Program will read a integer from the user.
//All the elements less than given number should be moved to one array 
//and all the elements greater than or equal to the given number should be moved to different array.
//The empty cells should be fill with 0.

public class Assign18SplitArray {

	public static void main(String[] args) {
		
		int [] arrEle = {34, 22, 29, 13, 33, 76, 54, 39, 61, 87};
		int [] arrLow = new int[10];	// Less than given numbers saved in this array
		int [] arrLar = new int[10];	// greater than given numbers saved here
		int iArrLowCnt = 0;	// maintains the numbers added into less than array
		int iArrLarCnt = 0; // maintains the numbers added into greater than array
		
		Scanner scnNum = new Scanner(System.in);
		System.out.print("Enter number: ");
		int iNum = scnNum.nextInt();

		for(int i = 0; i < arrEle.length; i++) {
			
			// If the array number is greater save into greater than array and increment the counter
			// similarly for lesser array
			if(arrEle[i] >= iNum) {
				
				arrLar[iArrLarCnt++] = arrEle[i];
				
			} else {
				
				arrLow[iArrLowCnt++] = arrEle[i];
				
			}
		}
		// Fill the empty cells in the array with zeroes
		// use the iArrLarCnt to start filling zeroes
		for(int i = iArrLarCnt; i< arrLar.length; i++) {
			
			arrLar[i] = -1;
		}

		// use the iArrLowCnt to start filling zeroes
		for(int i = iArrLowCnt; i< arrLow.length; i++) {
			
			arrLow[i] = -1;
		}
		
		System.out.print("Array with greater numbers: ");
		for(int i = 0; i< arrLar.length; i++) {
			
			System.out.print(" " + arrLar[i]);
		}
		
		System.out.println("");
		System.out.print("Array with Lower numbers: ");
		for(int i = 0; i< arrLow.length; i++) {
			
			System.out.print(" " + arrLow[i]);
		}
		
		scnNum.close();
	}
}
