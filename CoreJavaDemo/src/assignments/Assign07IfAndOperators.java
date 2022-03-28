/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 07
//A bank offers loan to customer if following criteria is met:
//Age of the customer is in between 21 to 35 years.
//Salary of customer is greater than 25000 per month.
//Write a program to perform below operations:
//Read the inputs, age and salary from the user.
//Verify if above criteria;
//if met; print “Customer eligible for loan”.
//if not met print “Customer is not eligible for loan at present.”
//Hint: Use Scanner class, comparison & logical operators, if statements.


public class Assign07IfAndOperators {

	public static void main(String[] args) {
		
		int ageLowerLimit = 18;
		int ageUpperLimit = 35;
		int salCutoff = 25000;
		
		Scanner scanAge = new Scanner(System.in);
		
		System.out.println("Enter Age: ");		
		int age = scanAge.nextInt();
		System.out.println("User age is: " + age);
		
		System.out.println("Enter Salary: ");
		int salary = scanAge.nextInt();
		System.out.println("User salary is: " + salary);

		if(age >= ageLowerLimit && age <= ageUpperLimit && salary >= salCutoff) {
			
			System.out.println("Met");
			
		} else {
			
			System.out.println("Not Met");
		}
		
		scanAge.close();
	}
}
