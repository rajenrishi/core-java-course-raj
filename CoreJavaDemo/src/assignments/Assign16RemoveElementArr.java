/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 16
//Write a program to remove an element from the array. 
//Shift the elements left to fill the gap after removing element. 
//Since the array size cannot be altered, fill the gap formed at last index with -1.


public class Assign16RemoveElementArr {
	
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
		int searchFor = 76;
		
		Assign16RemoveElementArr obj = new Assign16RemoveElementArr();
		int indVal = obj.searchEle(arrEle, searchFor);
		
		if(indVal == -1) {
			
			System.out.println(searchFor + " is not found.");
		
		} else {
			
			System.out.println(searchFor + " is at index: " + indVal);
			for(int i = indVal; i < arrEle.length-1; i++) {
				
				arrEle[i] = arrEle[i+1];				
			}
			
			arrEle[arrEle.length - 1] = -1;

			for(int ele : arrEle) {
				
				System.out.print(" " + ele);
			}
			
		}
	}
}
