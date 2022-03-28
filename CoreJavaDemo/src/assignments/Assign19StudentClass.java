/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

import java.util.Scanner;

//Assignment: 19
//Write a Java class named Student with two attributes student_id, student_name. 
//Create a method to display the attribute and their values in Student class. 
//Values for ‘student_id’ and ‘student_name’ will be passed to constructor.
//Hint: Use parameterized constructor.

class Student {
	
	String name;
	int id;
	
	Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public void display() {
		
		System.out.println(this.name + "'s ID number is: " + this.id);
	}
	
}

public class Assign19StudentClass {

	public static void main(String[] args) {

		Student stu = new Student("Siri", 10);
		stu.display();
	}
}
