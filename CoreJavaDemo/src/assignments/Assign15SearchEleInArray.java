/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 15
//Write a program to search for an element. If the element is present 
//return the index of that element, if not present return -1.

public class Assign15SearchEleInArray {
	
	public int searchEle(int[] arr, int ele) {
		
		for(int ind = 0; ind < arr.length; ind++) {
			
			if(ele == arr[ind]) {
				
				return ind;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int [] arrEle = {34, 22, 29, 13, 89, 76, 54, 39, 61};
		int searchFor = 2234;
		
		Assign15SearchEleInArray obj = new Assign15SearchEleInArray();
		int indVal = obj.searchEle(arrEle, searchFor);
		
		if(indVal == -1) {
			
			System.out.println(searchFor + " is not found.");
		
		} else {
			
			System.out.println(searchFor + " is at index: " + indVal);
		}
	}
}
