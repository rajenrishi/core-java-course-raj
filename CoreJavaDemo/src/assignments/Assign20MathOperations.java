/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 20
//Write a Java class MathOperations. Create “add”, “subtract” methods in the class. 
//These methods take two numbers as arguments and returns the sum and difference respectively. 
//Call these methods using class object and print the result.

class MathOperations {
	
	int num1;
	int num2;

	public int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		
		return num1 - num2;
	}
}

public class Assign20MathOperations {

	public static void main(String[] args) {

		MathOperations moObj = new MathOperations();
		int iSum = moObj.add(10, 20);
		System.out.println("Sum of numbers: " + iSum);
		
		int iDiff = moObj.subtract(20,  15);
		System.out.println("Difference of numbers: " + iDiff);
	}
}
